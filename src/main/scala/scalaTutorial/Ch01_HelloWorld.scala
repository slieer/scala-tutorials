

package scalaTutorial

/**
 * Scala 程序员的平衡感
 * 崇尚 val，不可变对象和没有副作用的方法。
 * 首先想到它们。只有在特定需要和判断之后才选择 var，可变对象和有副作用的方法。
 *
 * 所谓伴生对象， 也是一个Scala中的单例对象， 使用object关键字修饰。
 *  除此之外， 还有一个使用class关键字定义的同名类， 这个类和单例对象存在于同一个文件中， 这个类就叫做这个单例对象的伴生类， 相对来说， 这个单例对象叫做伴生类的伴生对象。
 */

class HelloWorld {

}

object HelloWorld {
  def scale = 5
  def scaleCalc = 7 * scale
  
  def pi = 3.141592653589793
  def radius = 10
  
  def piCalc = 2 * pi * radius

  def max(x: Int, y: Int) = if (x > y) x else y

  def greet() = println("Hello, world!")

  def greet_1(str: String) = println(str)

  def printStr(args: String) = args.foreach(arg => println(arg))

  

  def main(args: Array[String]) {
    println("Hello world!")

    //Everything is an object
    //Numbers are objects
    //Functions are objects

    var x = 10
    println("1 + 2 * 3 / x =" + 1 + 2 * 3 / x)

    var msg = "Goodbye cruel world!"
    val msgd = "Goodbye cruel world!"

    val name: String = "test"
    println("isLower:" + name.exists(_.isLower))
    println("isLD: " + name.exists(_.isLetterOrDigit))

    //val 1 = 2
    
    println(piCalc)
    println(scaleCalc)
  }
}
