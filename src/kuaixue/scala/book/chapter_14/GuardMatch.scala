package kuaixue.scala.book.chapter_14

object Guard extends App{
  def chTest(ch : Double): Boolean={
    //val ch = 3.14
    ch match{
      case x if(x > 3 && x < 4) =>true
      case _ => false
    }
  }
  
  println(chTest(3.1415))
  println(chTest(5))
}