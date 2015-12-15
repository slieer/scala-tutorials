

package scalaTutorial

/**
 * Scala 程序员的平衡感
 * 崇尚 val，不可变对象和没有副作用的方法。
 * 首先想到它们。只有在特定需要和判断之后才选择 var，可变对象和有副作用的方法。
 */
object HelloWorld {
  /**递归*/
  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x - 1)
  
  /**尾递归*/
  def factorialTailRec(n: BigInt, acc : BigInt): BigInt={
    if(n <= 0) acc
    else factorialTailRec(n - 1, acc)
  }

  def max(x: Int, y: Int) = if (x > y) x else y
  def greet() = println("Hello, world!")
  
  def greet_1(str: String) = println(str)
  
  def printStr(args: String)= args.foreach(arg => println(arg))
//  def printStr1(args: String)= args.foreach((arg: String) => println(arg))
  
  def main(args: Array[String]) {
    println("Hello world!")

    //Everything is an object
    //Numbers are objects
    //Functions are objects

    var x = 10
    println("1 + 2 * 3 / x =" + 1 + 2 * 3 / x)

    println("10!=" + factorial(10))

    var msg = "Goodbye cruel world!"
    val msgd = "Goodbye cruel world!"

    val name:String = "test"
    println("isLower:" + name.exists(_.isLower))
    println("isLD: " + name.exists(_.isLetterOrDigit))

    //val 1 = 2
  }
}