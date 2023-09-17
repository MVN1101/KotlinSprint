fun main() {
    val seconds = 6480
    val reminderOfSeconds = seconds % 60
    val minutes = seconds / 60
    val reminderOfMinutes = minutes % 60
    val hours = minutes / 60

//    println(reminderOfSeconds)
//    println(minutes)
//    println(reminderOfMinutes)
//    println(hours)

    println("0$hours:$reminderOfMinutes:0$reminderOfSeconds")
}