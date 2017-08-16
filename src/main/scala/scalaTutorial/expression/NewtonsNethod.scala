package scalaTutorial.expression

import scala.math.abs

/**
 * 使用牛顿法求解平方根
 *
 * 给定一个数 x，可假设其平方根为任意一个正数 ( 在这里，我们选定 1 为初始的假设 )，
 * 然后比较 x与该数的平方，如果两者足够近似（比如两者的差值小于 0.0001），则该正数即为 x的平方根；
 * 否则重新调整假设，假设新的平方根为上次假设与 x/ 上次假设的和的平均数。
 */
class MethodImpl1 {
  def sqrtIter(guess: Double, x: Double): Double = {
    if (isGoodEnough(guess, x)) {
      guess
    } else {
      sqrtIter(guessNumber(guess, x), x)
    }
  }

  def guessNumber(prevGuess: Double, x: Double): Double = {
    (prevGuess + x / prevGuess) / 2
  }
  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.0001

  def sqrt(x: Double): Double = sqrtIter(1, x)
}

class MethodImpl1_v1 {
	def sqrt(x: Double): Double = sqrtIter(1, x)
	
  def sqrtIter(guess: Double, x: Double): Double = {
    def guessNumber(prevGuess: Double, x: Double): Double = {
      (prevGuess + x / prevGuess) / 2
    }
    def isGoodEnough(guess: Double, x: Double) =
      abs(guess * guess - x) < 0.0001


    if (isGoodEnough(guess, x)) {
      guess
    } else {
      sqrtIter(guessNumber(guess, x), x)
    }
  }
}

class MethodImpl2 {
  // 目标函数，通过将需要用到的辅助函数定义为内部函数，实现细节的隐藏
  def sqrt(x: Double): Double = {

    // 迭代函数，若解不满足精度，通过递归调用接续迭代
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess))
        guess
      else
        sqrtIter((guess + x / guess) / 2)

    // 判断解是否满足要求
    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) < 0.0001

    // 辅助函数，求绝对值
    def abs(x: Double) =
      if (x < 0) -x else x

    sqrtIter(1)
  }

}
object NewtonsNethod extends App {

  //println(new MethodImpl1().sqrt(2))
  println(new MethodImpl1_v1().sqrt(2))
  //println(new MethodImpl2().sqrt(2))
}
