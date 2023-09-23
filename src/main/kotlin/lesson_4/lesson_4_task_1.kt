package lesson_4

fun main() {
    val weightFrom = 35
    val weightTo = 100
    val volume = 100

    var  baggageWeight = 20
    var baggageVol = 80

    println("Груз с весом $baggageWeight кг и объемом $baggageVol л соответствует категории 'Average': " +
            "${baggageWeight >= weightFrom && baggageWeight <= weightTo && baggageVol < volume}")

    baggageWeight = 50
    baggageVol = 100

    println("Груз с весом $baggageWeight кг и объемом $baggageVol л соответствует категории 'Average': " +
            "${baggageWeight >= weightFrom && baggageWeight <= weightTo && baggageVol < volume}")
}
