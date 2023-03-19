package nitro.network.utils

import android.text.format.DateUtils
import java.text.SimpleDateFormat
import java.util.*

class DateUtil {
    companion object {
        fun longToDate(timeSTamp: Long): String? {
            val pattern: String = if (DateUtils.isToday(timeSTamp)) {
                "hh:mm"
            } else {
                "MMM d"
            }
            return SimpleDateFormat(pattern, Locale.getDefault()).format(timeSTamp)
        }

        fun getCurrentDate(): Long {
            return Date().time
        }

        fun getToday(): String {
            val today = getCurrentDate()
            return SimpleDateFormat("d MMM yyyy", Locale.getDefault()).format(today)
        }
    }
}