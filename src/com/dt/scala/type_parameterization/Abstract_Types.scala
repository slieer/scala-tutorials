package com.dt.scala.type_parameterization

import scala.io.Source
import scala.io.BufferedSource
/**
 * @author Wang Jialin
 * Date 2015/7/18
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
trait Reader{
  type In <: java.io.Serializable
  type Contents
  def read(in: In): Contents
}
class FileReader extends Reader {
  type In = String
  type Contents = BufferedSource
  override def read(name: In)  = Source.fromFile(name)
}
object Abstract_Types {

  def main(args: Array[String]) {
    val fileReader = new FileReader
    val content = fileReader.read("E:\\WangJialin.txt")
    for (line <- content.getLines){
		  println(line)
		}
  }

}