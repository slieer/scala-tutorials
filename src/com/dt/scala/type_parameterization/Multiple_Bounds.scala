package com.dt.scala.type_parameterization

/**
 * @author Wang Jialin
 * Date 2015/7/8
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */

class M_A[T]
class M_B[T]

object Multiple_Bounds {

  def main(args: Array[String]) {
    implicit val a = new M_A[Int]
    implicit val b = new M_B[Int]
    def foo[ T : M_A : M_B ](i:T) = println("OK")
    foo(2)
    
  }

}