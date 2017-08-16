package kuaixue.scala.book.chapter_21

class Impli {
  def testParam(implicit name: String) {
    println(name)
  }
}

object ImplicitVal extends App {
	implicit val name = "Implicited !"
  val i = new Impli
  
  i.testParam
  i.testParam("Spark !")
}