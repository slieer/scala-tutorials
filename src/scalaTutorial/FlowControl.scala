package scalaTutorial

import scala.io.Source
import java.io.File

object FlowControl extends App {
  def arr = for (i <- 0 to 9) yield i
  println("arr:" + arr);

  def arr1 = for (i <- 1 to 5) yield { i * 2 }

  def arr11 = for (i <- 1 to 5) yield i * 2
  for (face <- arr11.getClass.getInterfaces) println("interface:" + face)

  println("cononicalName:" + arr11.getClass.getCanonicalName)

  val a = Array(1, 2, 3, 4, 5)

  def reArr = for (e <- a) yield e

  def reArr1 = for (e <- a if e > 2) yield e

  val file = new File(".")
  val filesHere = file.listFiles()
  
  def sum(args: Int*):Int = {
    var result = 0
    for(arg <- args)result += arg
    result
  }
  
  def sum1(args: Int*):Int = {
    var result = 0
    args.foreach { x => result += x }  
    result
  }
  
  def listScala = for {
    file <- filesHere
    if file.isFile
    if file.getName.endsWith(".scala")
  } yield file

  listScala.foreach { x => println }
  
  println(sum(1 to 5: _*))
  
  println(sum1(1 to 5: _*))
}