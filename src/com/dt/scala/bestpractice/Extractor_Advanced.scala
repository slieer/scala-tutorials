package com.dt.scala.bestpractice
/**
 * @author Wang Jialin
 * Date 2015/8/3
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */

object :> {
    def unapply[A] (list: List[A]) = {
        Some( (list.init, list.last) )
    }
}

object Extractor_Advanced {

  def main(args: Array[String]) {
    (1 to 9).toList match{ case _ :> 9 => println("Hadoop") }
    (1 to 9).toList match{ case x :> 8 :> 9 => println("Spark") }
    (1 to 9).toList match{ case :>(:>(_,8),9) => println("Flink") }
    
  }

}