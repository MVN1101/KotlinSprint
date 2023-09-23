package lesson_2

import kotlin.math.pow

fun main() {

    val startBalance = 70000
    val rate = 16.7
    val periodOfDeposit = 20

    val finishBalance = startBalance * (1 + rate/100).pow(periodOfDeposit)
    println("%.3f".format(finishBalance))

}