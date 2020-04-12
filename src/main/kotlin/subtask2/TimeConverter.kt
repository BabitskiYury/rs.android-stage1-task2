package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val hours= listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve");
        val minutes= listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty");
        return when (minute.toInt()) {
            0 -> hours[hour.toInt()]+" o' clock"
            1 -> "one minute past "+hours[hour.toInt()]
            15 -> "quarter past " + hours[hour.toInt()]
            30 -> "half past " + hours[hour.toInt()]
            45 -> "quarter to " + hours[hour.toInt() + 1]
            in 1..30 -> minutes[minute.toInt() - 1] + " minutes past " + hours[hour.toInt()]
            in 31..60 -> minutes[60 - minute.toInt() - 1] + " minutes to " + hours[hour.toInt() + 1]
            else -> ""
        }
    }
}
