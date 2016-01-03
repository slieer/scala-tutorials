package com.dt.scala.bestpractice
import scala.reflect.runtime.universe._
/**
 * @author Wang Jialin
 * Date 2015/8/4
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */

class Spark
trait Hadoop
object Flink
class Java{
  class Scala
}
object Type_Advanced {

  def main(args: Array[String]) {
    println(typeOf[Spark])
    println(classOf[Spark]) //Class[_ <: Spark]
    
    
    val spark = new Spark
    
    println(classOf[Hadoop])
    println(typeOf[Hadoop])
    
    println(Flink.getClass)
//    println(classOf[Flink])
    
    val java1 = new Java
    val java2 = new Java
    val scala1 = new java1.Scala
    val scala2 = new java2.Scala
    println(scala1.getClass)
    println(scala2.getClass)
    println(typeOf[java1.Scala] == typeOf[java2.Scala])
    println(typeOf[java1.Scala])
    println(typeOf[java2.Scala])
    
    println(classOf[List[Int]] == classOf[List[String]])
    println(typeOf[List[Int]] == typeOf[List[String]])
    
  }

}