package kuaixue.scala.book.chapter_13.immutable
/**不可变对象序列List*/

object ListTest extends App {
  def intArr() {
    val oneTwo = List[Int](1, 2)
    val twoThree = List(2, 3)
    val threeFour = List(3, 4)

    val andStr = oneTwo ::: threeFour
    val oneTwoThree = 1 :: twoThree
    val oneTwoThree_ = andStr :: 1 :: 2 :: 3 :: Nil

    println(oneTwo + " and " + threeFour + " were not mutated.")
    println("Thus, " + andStr + " is a new List.")

    println(oneTwoThree)
    println(oneTwoThree_)
  }

  //  println(List("a", "b") ::: List("c", "d"))
  //  println(List("a", "b") :: List("c", "d"))

  def listFor() {
    var thrill = "Cool" :: "tools" :: "rule" :: Nil
    println(thrill(2))

    println(thrill.count { thizStr => thizStr.length() == 4 })

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

  val digits = List(4, 2)
  var add = 9 :: digits

  9 :: 4 :: 2 :: Nil
  9 :: (4 :: (2 :: Nil))

  def sum(lst: List[Int]): Int =
    if (lst == Nil) 0 else lst.head + sum(lst.tail)
  //as same as
  def sum_v1(lst: List[Int]): Int = lst match {
    case Nil => 0
    case h :: t => h + sum_v1(t)
  }

  digits.sum
  digits contains 1

  def map() {
    val names = List("Peter", "Paul", "Marry")
    names.map { x => x.toLowerCase() }
    //as same as
    names.map(_.toLowerCase)
    //as same as
    for (n <- names) yield n.toUpperCase()
  }

  /**
   * fold函数将一种格式的输入数据转化成另外一种格式返回<br>
   * <li>0、代码开始运行的时候，初始值0作为第一个参数传进到fold函数中，list中的第一个item作为第二个参数传进fold函数中。
   * 　　*<li>1、fold函数开始对传进的两个参数进行计算，在本例中，仅仅是做加法计算，然后返回计算的值；
   * 　　*<li>2、Fold函数然后将上一步返回的值作为输入函数的第一个参数，并且把list中的下一个item作为第二个参数传进继续计算，同样返回计算的值；
   * 　　*<li>3、第2步将重复计算，直到list中的所有元素都被遍历之后，返回最后的计算值，整个过程结束；
   */
  def hold(): Int = {
    val numbers = List(5, 4, 8, 6, 2)

    numbers.fold(0) { (z, i) =>
      z + i
    }
  }

  println(hold)

  def holdLeft() {
    def foo(x: Array[String]) = x.foldLeft("")((a, b) => a + b)
    println("concat arguments = " + foo(args))
  }
}