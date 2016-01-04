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
object FileOps {
	def main(args: Array[String]) {
//		val file = Source.fromFile("E:\\WangJialin.txt") 
		val file = Source.fromURL("http://spark.apache.org/")
		for (line <- file.getLines){
		  println(line)
		}
	}
}