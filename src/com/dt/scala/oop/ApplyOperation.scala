package com.dt.scala.oop
/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */

class ApplyTest{
  def apply() = println("I am into Spark so much!!!")
   
  def haveATry{
    println("Have a try on apply!")
  }
}
object ApplyTest{
  def apply() = {
    println("I am into Scala so much!!!")
    new ApplyTest
  }
}
object ApplyOperation {
  def main(args: Array[String]) {
    val array = Array(1,2,3,4,5)
    val a = ApplyTest()
    a.haveATry
//	  val a = new ApplyTest
//	  a.haveATry
	  println(a())
//	  
  }
 
}