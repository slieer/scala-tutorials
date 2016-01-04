package com.dt.scala.implicits
/**
 * @author Wang Jialin
 * Date 2015/7/19
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
object Implicit_Conversions_with_Implicit_Parameters {

  def main(args: Array[String]) {
    def bigger[T](a: T, b: T)(implicit ordered: T => Ordered[T])
    	= if (a > b) a else b
    println(bigger(4,3))
    println(bigger(4.2,3))
    println(bigger("Spark","Hadoop"))
  }

}