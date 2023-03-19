package nitro.network.util;

import android.content.Context;

import nitro.network.R;

public enum PasswordStrength {

    WEAK(R.string.password_strength_weak, R.color.tooshort),
    MEDIUM(R.string.password_strength_medium, R.color.weak),
    STRONG(R.string.password_strength_strong, R.color.medium),
    VERY_STRONG(R.string.password_strength_very_strong, R.color.strong);

    //--------REQUIREMENTS--------
    static int REQUIRED_LENGTH = 8;
    static int MAXIMUM_LENGTH = 15;
    static boolean REQUIRE_SPECIAL_CHARACTERS = true;
    static boolean REQUIRE_DIGITS = true;
    static boolean REQUIRE_LOWER_CASE = true;
    static boolean REQUIRE_UPPER_CASE = false;

    int resId;
    int color;

    PasswordStrength(int resId, int color) {
        this.resId = resId;
        this.color = color;
    }

    public CharSequence getText(Context ctx) {
        return ctx.getText(resId);
    }

    public int getColor() {
        return color;
    }

    public static PasswordStrength calculateStrength(String password) {
        int currentScore = 0;
        boolean sawUpper = false;
        boolean sawLower = false;
        boolean sawDigit = false;
        boolean sawSpecial = false;


            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (!sawSpecial && !Character.isLetterOrDigit(c)) {
                    currentScore += 1;
                    sawSpecial = true;
                } else {
                    if (!sawDigit && Character.isDigit(c)) {
                        currentScore += 1;
                        sawDigit = true;
                    } else {
                        if (!sawUpper || !sawLower) {
                            if (Character.isUpperCase(c))
                                sawUpper = true;
                            else
                                sawLower = true;
                            if (sawUpper && sawLower)
                                currentScore += 1;
                        }
                    }
                }

            }

        if (password.length() < 3) {
            currentScore = 0;
        } else if (password.length() <= 5) {
            currentScore = 1;
        } else {
            if (sawUpper && sawLower && sawSpecial && sawDigit && password.length() >= 8)
                currentScore = 3;
            else currentScore = 2;
        }

        switch (currentScore) {
            case 0:
                return WEAK;
            case 1:
                return MEDIUM;
            case 2:
                return STRONG;
            case 3:
                return VERY_STRONG;
            default:
        }

        return VERY_STRONG;
    }

}
