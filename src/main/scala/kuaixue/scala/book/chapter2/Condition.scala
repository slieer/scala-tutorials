package kuaixue.scala.book.chapter2

object condition extends App{
  val x = 1
  def ifTest = if(x > 0) 1 else -1
  
  val s = if(x > 0) 1 else -1
  
  val s1 = if(x > 0) "positive" else -1
  
  def equalsExpression(){
	  val s = if(x > 0)  1
    val s1 = if(x > 0) 1 else ()
    val s2 = if(x > 0) 1 else Unit
  }
    
}