
package collect.immutable/**
 * 元组：tuple。与列表一样，元组也是不可变的，但与列表不同，元组可以包含不同类型的元素。
 * */
object TupleTest extends App {
  val pair = (99, "Luftballons")
  println(pair._1)
  println(pair._2)
}