package com.dt.scala.actor
import scala.actors.Actor._
import scala.actors.Actor
/**
 * @author Wang Jialin
 * Date 2015/7/23
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
object Actor_Message extends Actor {
  def act() {
    while(true){
        receive {
          case msg => println("Message content Actor from inbox: " + msg)
        }
      }
  }
}
object Actor_Messages {

  def main(args: Array[String]) {
    val actor_Message = actor{
      while(true){
        receive { //apply isDefinedAt
          case msg => println("Message content from inbox: " + msg)
        }
      }
    }
    val double_Message = actor{
    	while(true){
    		receive {
    		case msg : Double => println("Double Number from inbox: " + msg)
//    		case _ => println("Something Unkown" )
    		}
    	}
    }
    Actor_Message.start
    Actor_Message ! "Hadoop"
    actor_Message ! "Spark"
    double_Message ! Math.PI
    double_Message ! "Hadoop"
    
  }

}