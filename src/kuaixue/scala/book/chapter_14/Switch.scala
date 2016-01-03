package kuaixue.scala.book.chapter_14

object Switch {
  def f()={
    val ch: Char = 'c'
    val sign1 = ch match {
      case '+' => 1
      case '_' => -1
      case _ => 0
    }
  }
  
  f()
}