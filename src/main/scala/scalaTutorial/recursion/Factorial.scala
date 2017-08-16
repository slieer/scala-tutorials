package scalaTutorial.recursion

object factorial extends App {
  /**递归*/
  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x - 1)

  /**尾递归*/
  def factorialTailRec(n: BigInt, acc: BigInt): BigInt = {
    if (n <= 0) acc
    else factorialTailRec(n - 1, acc)
  }

  println("10!=" + factorial(10))
  
  def until(condition : => Boolean ) (block: => Unit) : Unit={
    if(! condition){
      block
      until(condition)(block)
    }
  }
}