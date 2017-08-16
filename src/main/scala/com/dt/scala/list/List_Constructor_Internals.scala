package com.dt.scala.list
/**
 * @author Wang Jialin
 * Date 2015/8/8
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */

abstract class Big_Data
class Hadoop extends Big_Data
class Spark extends Big_Data

object List_Constructor_Internals {

  def main(args: Array[String]){
    val hadoop = new Hadoop :: Nil
    val big_Data = new Spark :: hadoop
    
    
  }

}