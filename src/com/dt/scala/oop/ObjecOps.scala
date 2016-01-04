package com.dt.scala.oop
/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
class University{
  val id = University.newStudenNo
  private var number =0
  def aClass(number:Int){this.number += number}
}

object University{
  private var studentNo = 0
  def newStudenNo = {
    studentNo += 1
    studentNo
  }
}


object ObjecOps {

  def main(args: Array[String]): Unit = {
    
    println(University.newStudenNo)
    println(University.newStudenNo)
    
    
  }

}