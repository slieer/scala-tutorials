package com.dt.scala.implicits

import java.io.File

import scala.io.Source
/**
 * @author Wang Jialin
 * Date 2015/7/20
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
object Context_Helper{  
    implicit class FileEnhancer(file : File){    
        def read = Source.fromFile(file.getPath).mkString  
    }
    implicit class Op(x:Int){
         def addSAP(second: Int) = x + second
    }
}
object Implicits_Class {

  def main(args: Array[String]){
    import Context_Helper._
    println(1.addSAP(2))
    println(new File("E:\\WangJialin.txt").read)   
    
  }
  	
}