package kuaixue.scala.book.chapter5

import scala.beans.BeanProperty

/**
 * 
Scala对setter和getter的控制
如果字段是私有的，则getter和setter方法也是私有的
如果字段是val，则只有getter方法被生成
如果你不需要任何getter和setter，可以将字段声明为private[this]
 */
class BeanSeterGeterTest {
	private val privVal:Int = 10

	@BeanProperty
	var num:Int = 10
	@BeanProperty
	var name = "Hi"
  
  @BeanProperty
  var value = 0
  
  def increment ={
    value += 1
    this
  }
  
  def current() = value
}

object BeanSeterGeterTest extends App{
  val c = new BeanSeterGeterTest()
  c.setValue(1000)
  c.increment.increment
  println("set val:" + c.getValue());
}