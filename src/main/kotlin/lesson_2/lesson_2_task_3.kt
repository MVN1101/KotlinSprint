package lesson_2

fun main() {

    val hoursOfStart = 9
    val minutesOfStart = 39
    val timeOfTrip = 457

    val timeOfStart = hoursOfStart * 60 + minutesOfStart
    val minutesOfTrip = timeOfStart + timeOfTrip

    val hourOfEnd = minutesOfTrip/ 60
    val minutesOfEnd = minutesOfTrip % 60

    println("Arrival time: %02d:%02d".format(hourOfEnd, minutesOfEnd))
}