package com.dt.scala.actor
/**
 * @author Wang Jialin
 * Date 2015/7/25
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
import scala.actors.Actor
import scala.actors.Actor._
import java.net.InetAddress
import java.net.UnknownHostException

object NameResolver extends Actor{
 
  def act(){
//    react {
//      case Net (name, actor) => 
//        actor ! getIp(name)
//        act
//      case "EXIT" => println("Name resolver exiting.")
//      case msg => 
//        println("Unhandled message : " + msg) 
//      	act
//    }
    loop {
      react {
	    case Net (name, actor) => 
	    	actor ! getIp(name)
	    	
	    case msg => 
	    	println("Unhandled message : " + msg) 
	    	
    }
    }
    
 
  }
  def getIp(name : String) : Option[InetAddress] = {
    try{
      println(InetAddress.getByName(name))
      Some(InetAddress.getByName(name))
    } catch {
      case _ : UnknownHostException => None
    }
  }
}

case class Net(name : String, actor: Actor)

object Actor_More_Effective {

  def main(args: Array[String]) {
    NameResolver.start
    NameResolver ! Net("www.baidu.com", self)
    
    println(self.receiveWithin(1000){case x => x})
    
  }

}