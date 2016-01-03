package com.dt.scala.type_parameterization

/**
 * @author Wang Jialin
 * Date 2015/7/17
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
trait Logger { 
  def log (msg : String) }
trait Auth { 
    auth : Logger => 
    def act(msg : String) { 
        log(msg)
    }
}  
object DI extends Auth with Logger { 
  override def log(msg : String) = println(msg); }
object Dependency_Injection {

  def main(args: Array[String]) {
    DI.act("I hope you'll like it")
  }

}