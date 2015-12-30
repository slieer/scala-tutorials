package kuaixue.scala.book.chapter_12

object ControlAbstract extends App {
  def runInThread(block: () => Unit) {
    new Thread {
      override def run() {
        block()
      }
    }.start()
  }

  def runInThread_v1(block: => Unit) {
    new Thread {
      override def run() {
        block
      }
    }.start()
  }

  runInThread { () => println("Hi"); Thread.sleep(10000); println("Bye") }

  runInThread_v1 { println("Hi"); Thread.sleep(10000); println("Bye") }

  def until(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block

      until(condition)(block)
    }
  }

  var x = 10
  until(x == 0) {
    x -= 1
    println(x)
  }

/*  def until1(condition: => Boolean, block: => Unit) {
    if (!condition) {
      block
      until1(condition, block)
    }
  }

  var x1 = 10
  until1(x == 0, { x -= 1; println(x) })
*/
}