package kuaixue.scala.book.chapter2

object Func extends App {
  //最后一个块，即返回值
  def fac(n: Int) = {
    var r = 1

    for (i <- 1 to 10) r += 1
    r
  }

  def fac1(n: Int): Int = {
    var r = 1

    for (i <- 1 to 10) r += 1
    r
  }

  //递归函数，必须指定返回值
  def fac2(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)

  //默认参数值
  def decorate(str: String, left: String = "[", right: String = "]"): String = {
    left + str + right
  }

  decorate("Test")
  decorate("Test", "<<<")
  decorate("Test", "<<<", ">>>")

  //变长参数
  def sum(args: Int*) = {
    var result = 0
    for (i <- args) result += i

    result
  }

  def sum1(args: Int*) = {
    var result = 0
    args.foreach { x => result += x }

    result
  }
  
  sum(1,2,3,4)
  //_* 转化成参数序列
  sum(1 to 10: _*)
  
  
  def noReturnVal(x : String="Hello"){
    print("x:" + x)
  }
  
  //懒值
  
}