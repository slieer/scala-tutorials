package kuaixue.scala.book.chapter2

object For {
  def while_() = {
    var r = 10
    var n = 3;
    while (n > 0) {
      r = r * n
      n -= 1
    }
  }

  def for_() = {
    var r = 10
    var n = 3;

    for (i <- 1 to n)
      r = r * i
  }
  
  def util_()={
    val s = "hello"
    var sum = 0
    
//    for(i <- 0 util s.length)
//      sum += s(i)
  }
  
  
}