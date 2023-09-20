package lesson_2

fun main() {

    val crystalOre = 7
    val copperOre = 11
    val buff = 0.2

    val crystalOreBuff = crystalOre * buff
    val copperOreBuff = copperOre * buff
    println("Number of bonus crystal ore units: %.0f".format(crystalOreBuff))
    println("Number of bonus copper ore units: %.0f".format(copperOreBuff))
}