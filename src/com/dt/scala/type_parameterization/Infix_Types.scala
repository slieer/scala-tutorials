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
object Infix_Types {

  def main(args: Array[String]) {
    
    object Log { def >>:(data:String):Log.type = { println(data); Log } }
    "Hadoop" >>: "Spark" >>: Log
    
     val list = List()
     val newList = "A" :: "B" :: list
     println(newList)
    
    class Infix_Type[A,B]
    val infix: Int Infix_Type String = null
    val infix1: Infix_Type[Int, String] = null
    
    case class Cons(first:String,second:String)
    val case_class = Cons("one", "two")
    case_class match { case "one" Cons "two" => println("Spark!!!") } //unapply
    
  }

}