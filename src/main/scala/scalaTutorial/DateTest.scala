package scalaTutorial

import java.util.{ Date, Locale }
import java.text.DateFormat._

object FrenchDate extends App {
  var now = new Date
  var df = getDateInstance(LONG, Locale.FRANCE)

  println(df format now)
}