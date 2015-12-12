package ScalaTutorial

import java.util.{ Date, Locale }
import java.text.DateFormat._

object FrenchDate {
  def main(args: Array[String]) {
    var now = new Date
    var df = getDateInstance(LONG, Locale.FRANCE)

    println(df format now)
  }
}