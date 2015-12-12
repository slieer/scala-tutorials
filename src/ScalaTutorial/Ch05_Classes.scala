package ScalaTutorial

class Ch05_Classes(real: Double, imaginary: Double) {
  def re() = real
  def im() = imaginary
  
  def re1 = real
  def im1 = imaginary
  
  override def toString() =
    "" + re + (if (im < 0) "" else "+") + im + "i"  
}

object ComplexNumbers {
  def main(args: Array[String]) {
    val c = new Ch05_Classes(1.2, 3.4)
    println("imaginary part: " + c.im())
  }
}