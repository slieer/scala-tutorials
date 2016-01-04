package com.dt.scala.implicits

import scala.io.Source
import java.io.File
/**
 * @author Wang Jialin
 * Date 2015/7/19
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */

class RichFile(val file:File){
   def read = Source.fromFile(file.getPath()).mkString
}
 
object Context{
    implicit def file2RichFile(file:File)= new RichFile(file) //File -> RichFile
}
object Hello_Implicit_Conversions {

  def main(args: Array[String]) {
   	  import Context.file2RichFile
	  println(new File("E:\\WangJialin.txt").read)  
  }
}