package com.dt.scala.dataset
/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object List_Interal {

  def main(args: Array[String]) {
    
    val list : List[Int] = List(1,2,3,4,5)
    val listAny : List[Any] = list
    println(list.isEmpty)
    println(list.head)
    println(list.tail)
    println(list.length)
    println(list.drop(2))
    list.map(_*2)
    
  }

}