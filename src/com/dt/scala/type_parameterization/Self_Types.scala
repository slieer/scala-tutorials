package com.dt.scala.type_parameterization
/**
 * @author Wang Jialin
 * Date 2015/7/16
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */

class Self { 
    self => 
    val tmp="Scala" 
    def foo = self.tmp + this.tmp
}
trait S1
class S2 { this:S1 => }
class S3 extends S2 with S1

trait T { this:S1 => } 
object S4 extends T with S1
object Self_Types {

  def main(args: Array[String]) {
    class Outer { outer => 
	    val v1 = "Spark"
	    class Inner {
	        println(outer.v1) 
	    }
    }      
    val c = new S2 with S1
  }

}