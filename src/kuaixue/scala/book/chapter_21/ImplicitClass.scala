package kuaixue.scala.book.chapter_21

class Implicit {}

class A {}

class RichA(a: A) {
  def rich {
    println("so rich...")
  }
}

object ImplicitClass extends App{
  implicit def a2RichA(a : A) = new RichA(a)
  
  val a = new A
  a.rich
  
  def testParam(implicit name: String){
    println(name)
  }
  
  implicit val name = "Implicited !"
  testParam
  
  testParam("Spark !")
}