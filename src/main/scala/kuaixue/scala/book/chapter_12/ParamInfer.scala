package kuaixue.scala.book.chapter_12

import java.util.Arrays

object ParamInfer extends App {
  import scala.math._
  val num = 3.14
  val fun = ceil _

  println("fun=" + fun) //<function1>

  fun(num)
  val ar = Array(3.14, 1.42, 2.0).map(fun)
  println("array=" + (Arrays toString ar))

  val triple = (x: Double) => 3 * x
  triple(3)

  val ar1 = Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x)
  val ar2 = Array(3.14, 1.42, 2.0).map { (x: Double) => 3 * x }
  val ar3 = Array(3.14, 1.42, 2.0) map { (x: Double) => 3 * x }

  def valueAtOneQuarter(f: (Double) => Double)= f(0.25)
  
  valueAtOneQuarter(ceil _)
  valueAtOneQuarter(sqrt _)
  
  valueAtOneQuarter(x => x * 3)
  valueAtOneQuarter(3 * _)
  
  
  //val fun = 3 * (_ : Double)
  
  (1 to 9).map("*" * _).foreach { println _}
  (1 to 9).map("*" * _).foreach {x => println(x)}
  (1 to 9).filter(_ % 2 == 0)  //2 4 6 8
  val val10 = (1 to 9).reduceLeft(_ * _)  //(((1*2)*3)*4) ....;  每一个_、第二个_，分别代表两个参数
  println(val10)
  
  "Mary has a little lamb".split(" ").sortWith(_.length < _.length)
  "Mary has a little lamb".split(" ").startsWith("a")
  
  
  def mulOneAtATime(x: Int) = (y : Int) => x * y
  mulOneAtATime(3)
  mulOneAtATime(3)(4)
  
  def mulOneAtATime1(x: Int)(y : Int) = x * y
  
  
  val a = Array("hello", "world")
  val b = Array("Hello", "World")
  
  a.corresponds(b)(_.equalsIgnoreCase(_))
  a.corresponds(b)(_ equalsIgnoreCase _)
}