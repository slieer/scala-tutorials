package kuaixue.scala.book.chapter2

import math.sqrt

object BlockExpre extends App {
  {
    //块包含一系列的表达式，其结果也是一个表达式，最后一个表达式就是块的值。
  }

  def exp1 = {
    val x, y = 1
    val x0, y0 = 10

    val distance = {
      val dx = x - x0
      val dy = y - y0
      sqrt(dx * dx + dy * dy)
    }

    println(distance)
  }
  
  exp1
  
  
}