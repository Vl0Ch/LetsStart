package someStuff.calc

import scala.io.StdIn.readLine

object Main {
  def main(args: Array[String]): Unit = {
    val expression = readLine().split(";").map(_.trim)

    val firstValue = expression(0).toInt
    val secondValue = expression(2).toInt
    val sign = expression(1)


    sign match {
      case "*" => println(firstValue * secondValue)
      case "/" => println(firstValue / secondValue)
      case "-" => println(firstValue - secondValue)
      case "+" => println(firstValue + secondValue)
      case _ => println("fuck u")
    }
  }
}
