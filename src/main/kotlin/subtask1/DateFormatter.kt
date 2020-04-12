package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            var month2 = month
            if(month.length== 1)
                month2="0"+month;
            LocalDate.parse(year+"-"+month2+"-"+day)
                .format(DateTimeFormatter.ofPattern("dd MMMM, EEEE")
                    .withLocale(Locale("ru")))
        } catch (e: DateTimeParseException) {
            "Такого дня не существует"
        }
    }
}
