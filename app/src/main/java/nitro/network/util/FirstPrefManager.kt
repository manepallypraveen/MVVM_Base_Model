package nitro.network.util

import android.content.Context
import android.content.SharedPreferences


class FirstPrefManager(var _context: Context) {
    var pref: SharedPreferences
    var editor: SharedPreferences.Editor
    var PRIVATE_MODE = 0

    var isFirstTimeLaunch: Boolean
        get() = pref.getBoolean(IS_FIRST_TIME_LAUNCH, true)
        set(isFirstTime) {
            editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime)
            editor.commit()
        }


    var IsFirstTimeLaunchDisplayAlertDialog: Boolean
        get() = pref.getBoolean(IS_FIRST_TIME_LAUNCH_DISPLAY_ALERT, true)
        set(isFirstTimeDisplayAlert) {
            editor.putBoolean(IS_FIRST_TIME_LAUNCH_DISPLAY_ALERT, isFirstTimeDisplayAlert)
            editor.commit()
        }


    companion object {
        private const val PREF_NAME = "Nitro-welcome"
        private const val IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch"
        private const val IS_FIRST_TIME_LAUNCH_DISPLAY_ALERT = "IsFirstTimeLaunchDisplayAlertDialog"
    }

    init {
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
        editor = pref.edit()
    }
}