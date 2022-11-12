import scala.io.StdIn.readLine
import scala.jdk.CollectionConverters._
import scala.language.postfixOps
object App {

  //def &&(bool: Boolean) = ???

  def main(args: Array[String]): Unit = {
    // Block A
    //val startValString = "Hello World!"
    val startVarString = "Hello World!"
    println("Hello world!")
    //reverse
    println(startVarString.reverse)
    //lowercase
    println(startVarString.toLowerCase())
    //minus exclamation
    println(startVarString.init)
    //add goodbye python
    val gbP = ", and goodbye python!"
    println(startVarString.init + gbP)
    //Block B
    println("введите годовой доход:")
    val yearSalary = readLine().toInt
    println("Размер премии, в процентах:")
    val bonus = readLine().toInt
    println("Компенсация питания:")
    val eatCompensation = readLine().toInt

    val sum = yearSalary + yearSalary*bonus/100 + eatCompensation
    val gross = sum - sum*0.13
    println("Годовая заработная плата, после вычета налогов: "+ gross)
    println(sum.getClass)

    //Block C
    val firstList = List (100, 150, 200, 80, 120, 75)
    val commonSalary = firstList.sum
    val countPersons = firstList.size
    val mediumSalary = commonSalary/countPersons
    println("Средняя ЗП:"+mediumSalary)
    val l = firstList map {_-mediumSalary}
    println("Значения показывают отклонения от средней ЗП :"+l)

    //BLock D
    val secondList = firstList :+ 135
    println("Появился новый сотрудник"+secondList)
    println("Пора пересчитать среднюю ЗП")
    val commonSalary1 = secondList.sum
    val countPersons1 = secondList.size
    val mediumSalary1 = commonSalary1 / countPersons1
    println("Средняя ЗП новая:" + mediumSalary1)
    val maxSalary = secondList.max
    val minSalary = secondList.min
    println("MAX зарплата: "+maxSalary)
    println("MIN зарплата: "+minSalary)

    //Block E
    val thirdList = secondList :++ List(350, 90)
    println("Пришли два новых сотрудника с окладами 90 и 350")
    println("Отсортированные ЗП сотрудников :"+thirdList.sorted)


    //Block F
    println("У нас еще один новенький! c ЗП 130")
    var fifthList = List.empty[Int]
    val worker_new: Int = 130
    var iteration: Int = 0
    var forthList = thirdList.sorted
    for (i <- forthList) {
      if (i <= worker_new) {
        iteration += 1
      }
      fifthList = forthList.slice(0,iteration)
      fifthList = fifthList :+ worker_new
      fifthList = fifthList ++ forthList.slice(iteration, forthList.length)
    }
    println("Вот какие ЗП у нас получились :"+fifthList)

    //Block G
    for (n <- fifthList) {
      if (!(n >= 120) || !(n <= 200)) {

      } else {
        println(n, "middle")
      }
    }
    // Block H
    var sixthList = List.empty[Long]
    for (i <- fifthList) {
      var now = (i * 1.07).round
      sixthList ::= now
    }

    println("ЗП до индексирования по возрастанию:")
    println(fifthList.sorted)
    println("ЗП после индексирования по возрастанию:")
    println(sixthList.sorted)

  }
  }
