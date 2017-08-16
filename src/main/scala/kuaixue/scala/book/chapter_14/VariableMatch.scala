package kuaixue.scala.book.chapter_14

object VariableMatch extends App{
  val (x, y) = (1, 2)
  val (q, r) = BigInt(10) /% 3
  
  val Array(first, second, _*) = Array(1,2,13,43)
  
  println("first=" + first)
  
  import scala.collection.JavaConversions.propertiesAsScalaMap
  
  for((k, v)<-System.getProperties if v == "")
    println(k)
    
}