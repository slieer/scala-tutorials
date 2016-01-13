package kuaixue.scala.book.chapter9

import scala.io.Source
import java.io.File
import java.io.FileInputStream
import java.io.PrintWriter

object FileTest extends App{
  def print(it: Iterator[String]){
    for(line <- it)println(line)    
  }
  
  def print1(it : Iterator[String]){
    for(line <- it){
      if(line.head != " ")println(line)
    }    
  }
  
  def fromLocalFile(){
	  val file = new File("/opt/devTools/maven/latest/conf/settings.xml")
		val source = Source.fromFile(file)
			  
		
		val it = source.getLines()
		print(it) 
		//print1(it)    
  }
  
  
  def fromNet(){
    val source1 = Source.fromURL("http://horstamnn.com", "UTF-8")
  } 
  
  def fromStr(){
    val source2 = Source.fromString("Hello, World")    
  }
  
  def fromConsole(){
    val source = Source.stdin
  }
  
  def fromBinFile(){
    val file = new File("/opt/devTools/akka/latest/lib/scala-library-2.11.7.jar");
    val in = new FileInputStream(file)
    
    val bytes = new Array[Byte](file.length().toInt)
    in.read(bytes)
    
    in.close()
  }
  
  def fromTextFile(){
    val file = new File("/opt/devTools/maven/latest/conf/settings.xml")
    val out = new PrintWriter(file)
  }
}