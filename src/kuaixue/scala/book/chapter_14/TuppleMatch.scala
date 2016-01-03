package kuaixue.scala.book.chapter_14

object TuppleTest extends App {
  //val pair:Any = (1,2,3, "hi", true, 0)
  //val pair: Any  = (0, 1, 2, 3, 0)
  val pair: Any  = (0, 1)
  val result = pair match {
    case (0, _) => "0..."
    case (y, 0) => "y=" + y
    case _ => "neither is 0"
  }

  println(result)
}
