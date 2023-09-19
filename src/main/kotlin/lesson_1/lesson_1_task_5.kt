fun main() {
    val seconds = 6480
    val reminderOfSeconds = seconds % 60
    val minutes = seconds / 60
    val reminderOfMinutes = minutes % 60
    val hours = minutes / 60

    println("%02d:%02d:%02d".format(hours,reminderOfMinutes,reminderOfSeconds))
}