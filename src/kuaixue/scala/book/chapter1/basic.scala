package kuaixue.scala.book.chapter1

/**
 * REPL（Read-Eval-Print Loop）
 * 交互式解释器
 */
object basic extends App {
  val valu = 8 * 5 + 2
  println("8*5+2:" + valu) //402
  println("8*5+2:" + (8 * 5 + 2)) //42

  val hello = "Hello"
  println("hello.toCharArray:" + hello.toCharArray.toString)
  println("hello.toCharArray:" + hello.toCharArray)
  println("hello.toLowerCase:" + hello.toLowerCase)

  //valu += 10
  var vari = 10
  vari += 5
  println("vari:" + vari)

  var a, b: String = null
  println("1.toString(): " + 1.toString())
  
  1.to(10).foreach(x => print(x + ", "))
  
  
  def mathTest(): Double={
	  import scala.math._
	  sqrt(2)
	  pow(2, 4)
	  min(3, Pi)
  }
  println(mathTest())
  
  println("Hello"(4))  //o
  println("Hello".apply(4))  //o
  
  println(BigInt("123456"))
  println(BigInt.apply("123456"))
}
