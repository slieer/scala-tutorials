package com.dt.scala.hello
/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object MapOperations {
	def main(args: Array[String]) {
		val ages = Map("Rocky" -> 27, "Spark" -> 5) 
		
		for((k,v) <- ages){
		  println("Key is " + k + ",value is " + v)
		}
		
		for((k,_) <- ages){ //placeholder
			println("Key is " + k)
		}
				
	}
}