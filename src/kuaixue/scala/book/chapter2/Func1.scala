package kuaixue.scala.book.chapter2

import scala.math.ceil

/**
 * 科里化（Currying）
 *
 *
 */
object Func1 {
  import scala.math._

  //作为值的函数
  val fun = ceil _
  // _将ceil方法转成了函数, 在Scala中，无法直接操纵方法，只能直接操纵函数，所以需要使用_。

  //匿名函数
  (x: Double) => 3 * x

  //带函数参数的函数
  def valueAtOneQuarter(f: (Double) => Double) = f(0.25)

  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    sumF
  }

  def sumInts = sum(x => x) //val sumInts = sum(x => x)
  def sumSquares = sum(x => x * x) //val sumSquares = sum(x => x * x)
  def sumOther = {
    def fint(x: Int): Int = x * (2 + x)
    sum(fint)
  }

  def sumOtherV1 = sum(x => x * (2 + x))

  def byName(f: => () => Unit) = {
    f
  }
  def byValue(f: () => Unit) = {}
  def testBy = {
    var count = 0
    while (count < 5) {
      byName { println(s"byName $count")
        println }

      byValue { println(s"byValue $count")
        println }
      
      count = count + 1
    }
    
  }
 
  def main(args: Array[String]): Unit = {
    println(fun(1.1))

    def f(x: Double): Double = {
      x * x
    }
    println(valueAtOneQuarter(f))

    println(sumInts(5, 1))
    println(sumInts(1, 10))
    println(sumInts(1, 15))
    
    testBy
  }
}