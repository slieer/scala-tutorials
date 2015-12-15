

package collect.immutable

object SetTest extends App {
  var jetSet = Set("Boeing", "Airbus")
  jetSet += "Lear"
  println(jetSet.contains("Cessna"))
}