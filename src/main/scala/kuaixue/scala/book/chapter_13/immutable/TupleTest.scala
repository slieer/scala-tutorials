package kuaixue.scala.book.chapter_13.immutable
/**
 * 元组：tuple。与列表一样，元组也是不可变的，但与列表不同，元组可以包含不同类型的元素。
 *
 * 这些_N数字是基于1的，而不是基于0的，
 * 因为对于拥有静态类型元组的其他语言，如Haskell和ML，从1开始是传统的设定。
 *
 */
object TupleTest extends App {
  val pair = (99, "Luftballons")
  println(pair._1)
  println(pair._2)

  val tp = (1, "ss", 2.0)

  val t1 = tp._1
  val t2 = tp._2
  val t3 = tp._3

  println(t1)

  val book =
    ("author" -> "Benjamin Pierce") ::
      ("title" -> "Types and Programming Languages") ::
      ("id" -> 262162091) ::
      ("price" -> 44.11) ::
      Nil
  println("book(0)=" + book(0))
  println("book(1)=" + book(1))
}