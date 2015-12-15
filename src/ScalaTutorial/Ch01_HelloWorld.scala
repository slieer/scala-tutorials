

package ScalaTutorial

/**
 * Scala 程序员的平衡感
崇尚 val，不可变对象和没有副作用的方法。
首先想到它们。只有在特定需要和判断之后才选择 var，可变对象和有副作用的方法。
 * */
object HelloWorld {
  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x - 1)

  def max2(x: Int, y: Int) = if (x > y) x else y

  def main(args: Array[String]) {
    println("Hello world!")

    //Everything is an object
    //Numbers are objects
    //Functions are objects

    var x = 10
    println(1 + 2 * 3 / x)

    println(factorial(10))

    var msg = "Goodbye cruel world!"

    val msgd = "Goodbye cruel world!"

  }
}