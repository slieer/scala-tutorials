

package scalaTutorial

object Timer {
  def oncePerSecond(callback: () => Unit) {
    while (true) {
      callback();
      Thread sleep 1000
    }
  }

  def timeFiles() {
    println("time files like an arrow...")
  }

  def main(args: Array[String]) {
    oncePerSecond(timeFiles)
  }
}