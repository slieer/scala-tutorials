
package collection.immutable/**不可变对象序列List*/
object ListTest extends App {
  val oneTwo = List[Int](1, 2)
  val threeFour = List(3, 4)

  val andStr = oneTwo ::: threeFour

  println(oneTwo + " and " + threeFour + " were not mutated.")
  println("Thus, " + andStr + " is a new List.")

  val twoThree = List(2, 3)
  val oneTwoThree = 1 :: twoThree
  
  println(oneTwoThree)

  val oneTwoThree_ = andStr :: 1 :: 2 :: 3 :: Nil
  println(oneTwoThree_)
  
  
  var o = List[Int](1, 2, 3)
  
}