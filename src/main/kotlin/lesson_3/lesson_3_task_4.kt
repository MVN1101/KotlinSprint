package lesson_3

fun main() {
    var markMoveFrom = "E"
    var numberMoveFrom = 2
    var markMoveTo = "E"
    var numberMoveTo = 4
    var numberOfMoves = 1

    println("$markMoveFrom$numberMoveFrom-$markMoveTo$numberMoveTo; $numberOfMoves")

    markMoveFrom ="D"
    numberMoveFrom = 2
    markMoveTo = "D"
    numberMoveTo = numberMoveFrom + 1
    numberOfMoves ++

    println("$markMoveFrom$numberMoveFrom-$markMoveTo$numberMoveTo; $numberOfMoves")

}