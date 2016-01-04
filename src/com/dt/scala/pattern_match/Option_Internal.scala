package com.dt.scala.pattern_match
/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object Option_Internal {

  def main(args: Array[String]){
    val scores = Map("Alice" -> 99, "Spark" -> 100)
    
    scores.get("Spark") match {
	  case Some(score) => println(score)
	  case None => println("No score")
	}
       
    
  }

}