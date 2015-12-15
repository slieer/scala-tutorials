
package collect.immutable/**不可变对象序列List*/

import sun.security.util.Length

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
  var o1 = List[Int](4, 5, 6)
  var o2 = o ::: o1
  println(o2)
  
  var o3 = o :: o1
  println(o3)
  
  println(List("a", "b") ::: List("c", "d"))
  println(List("a", "b") :: List("c", "d"))
  
  var thrill = "Cool" :: "tools" :: "rule" :: Nil
  println(thrill(2))
  
  println(thrill.count { thizStr => thizStr.length()==4 })
  
  thrill.foreach { x => print(x + ",") }
  thrill.foreach(s => print(s))
  thrill.foreach(print)
  
  println(thrill.exists { x => x.contains("o") })
  
  println(thrill.filter(s => s.length == 4))
  
  thrill.foreach(s => {
    var ss = s + "x"
    print(ss.+(","))
  })
  
}