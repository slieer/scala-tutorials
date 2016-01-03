package com.dt.scala.actor

import scala.actors.Actor
import scala.actors.Actor._
/**
 * @author Wang Jialin
 * Date 2015/7/23
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
case class Person(name: String, age: Int)

class HelloActor extends Actor{
  def act(){
    while(true){
        receive {
          case Person(name, age) => {
            println("Name: " + name + " : " + "Age: " + age)
            sender ! "Echo!!!"
                      }
          case  _ => println("Something else...")
        }
      }
  }
}
object Actor_With_CaseClass {

  def main(args: Array[String]) {
    val hiActor = new HelloActor
    hiActor.start
    hiActor ! Person("Spark", 6)
    
    self.receive{case msg => println(msg)}
//    self.receiveWithin(1000){case msg => println(msg)}
  }

}