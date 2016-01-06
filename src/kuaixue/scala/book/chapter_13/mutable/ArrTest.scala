

package kuaixue.scala.book.chapter_13.mutable

object Ch04_1_Arr extends App {
  def printArgs(args: Array[String]): Unit = {
    for (arg <- args)
      print(arg)
  }

  def printArgs_1(args: Array[String]): Unit ={
    args.foreach(print)
  }
  
  
  def printArgs_2(args: Array[String]): Unit = {
    for (i <- 0.to(args.length -1))
      print(args.apply(i))      
  }
  
  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

//  for (i <- 0 to 2)
//    print(greetStrings(i))
  printArgs_2(greetStrings)
  
  greetStrings.update(0, "Hi")
  greetStrings.update(1, ", ")
  greetStrings.update(2, "the world!\n")
    
  printArgs(greetStrings)
  
  val numNames = Array("zero", "one", "two")
  val numNames2 = Array.apply("zero", "one", "two")
    
}