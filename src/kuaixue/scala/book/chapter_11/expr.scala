package kuaixue.scala.book.chapter_11

object expr extends App{
  1.to(10)
  1 to 10
  1.-> (10)
  1 -> 10
  
  val and1 = 1 & 10
  val and = 1.&(10)   //infix
  println(and)   
  
  
  val str = 1 toString()
  
  //右结合
  1 :: 2 :: Nil
  1 :: (2 :: Nil)
  
}