package com.dt.scala.type_parameterization
/**
 * @author Wang Jialin
 * Date 2015/7/11
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
//class P[+T](val first: T, val second: T)
class P[+T](val first: T, val second: T){
//  def replaceFirst(newFirst: T) = new P[T](newFirst, second)
  def replaceFirst[R >: T](newFirst: R) = new P[R](newFirst, second)
}

object Variant_Positions {

  def main(args: Array[String]) {
     
  }

}