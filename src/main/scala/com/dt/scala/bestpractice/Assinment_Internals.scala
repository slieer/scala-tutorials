package com.dt.scala.bestpractice
/**
 * @author Wang Jialin
 * Date 2015/8/2
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
object Assinment_Internals {

  def main(args: Array[String]) {
    val a @ b = 1000
    println("a = " + a + ", b = " + b)
    val (c, d) = (1000, 2000)
    //    val (e,F) = (1000,2000)
    val Array(g, h) = Array(1000, 2000)
    //    val Array(i,J) = Array(1000,2000) 
    //    object Test { val 1 = 1 } 
    object Test { val 1 = 2 }

  }

}