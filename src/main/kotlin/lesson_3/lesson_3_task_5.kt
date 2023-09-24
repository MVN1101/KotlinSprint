package lesson_3

fun main() {

    val message = "D2-D4;0"

    val list1 = message.split(";")

    var move = list1[0]
    val list2 = move.split("-")
    val moveFrom = list2[0]
    val moveTo = list2[1]

    var numberOfMove = list1[1]

    println(moveFrom)
    println(moveTo)
    println(numberOfMove)

}