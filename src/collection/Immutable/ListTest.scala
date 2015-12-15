
package collection.Immutable/**不可变对象序列List*/
object ListTest extends App {
  var oneTwo = List(1, 2)
  var threeFour = List(3, 4)

  var andStr = oneTwo ::: threeFour

  println(oneTwo + " and " + threeFour + " were not mutated.")
  println("Thus, " + andStr + " is a new List.")

  val twoThree = List(2, 3)
  val oneTwoThree = 1 :: twoThree
  println(oneTwoThree)

  val oneTwoThree_ = andStr :: 1 :: 2 :: 3 :: Nil
  println(oneTwoThree_)
}