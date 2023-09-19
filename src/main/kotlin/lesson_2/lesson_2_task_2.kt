package lesson_2

fun main(){

    val numbOfWorkers = 50
    val numbOfTrainees = 30
    val salaryOfWorker = 50000
    val salaryOfTrainee = 20000

    val workersSalary = numbOfWorkers * salaryOfWorker
    val sumSalary = workersSalary + numbOfTrainees * salaryOfTrainee
    val avrSalary = sumSalary/(numbOfTrainees+numbOfWorkers)

    println("%,d".format(workersSalary))
    println("%,d".format(sumSalary))
    println("%,d".format(avrSalary))
}