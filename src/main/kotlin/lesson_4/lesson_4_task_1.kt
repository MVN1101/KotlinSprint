package lesson_4
fun main() {

    val numberOfTables = 13
    val busyTablesTd = 13
    val busyTablesTm= 9

    println("Доступность столиков на сегодня: ${busyTablesTd < numberOfTables} \n"  +
            "Доступность столиков на завтра: ${busyTablesTm < numberOfTables}")

}