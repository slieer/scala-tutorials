package com.dt.scala.hello

import scala.io.Source
/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object LazyOps {

  def main(args: Array[String]): Unit = {
    lazy val file = Source.fromFile("E:\\WangJlisssfsdalin.txt") 
    
    println("Scala")
    
	for (line <- file.getLines) println(line)
    
  }

}