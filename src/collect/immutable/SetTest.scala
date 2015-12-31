package collect.immutable

object SetTest extends App {
  var jetSet = Set("Boeing", "Airbus")
  jetSet += "Lear"
  println(jetSet.contains("Cessna"))
  
  Set(1, 2) union Set(1, 3)
  Set(1, 2, 4,7,8) intersect Set(1, 3)
  Set(1, 2, 4,7,8) diff Set(1, 3)

}