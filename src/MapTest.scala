

import scala.collection.mutable.HashMap

object MapTest extends App {
  var capital = Map("US" -> "Washington", "France" -> "Paris")
  capital += ("Japan" -> "Tokyo")
  println(capital("France"))

  val x: HashMap[Int, String] = new HashMap[Int, String]()
  x.+=(1 -> "xxx")
  x.+=(2 -> "yy")
  x.+=(3 -> "z")

  println(x)

  import scala.collection.mutable.Map
  //import scala.collection.immutable.Map
  val treasureMap = Map[Int, String]()
  treasureMap += (1 -> "Go to island.")
  treasureMap += (2 -> "Find big X on ground.")
  treasureMap += (3 -> "Dig.")
}
