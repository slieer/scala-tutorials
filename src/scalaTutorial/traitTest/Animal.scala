package scalaTutorial.traitTest

abstract class Animal {
  def walk(speed: Int)

  def breathe() = {
    println("animal breathes")
  }
}

/**
 * Trait像拥有部分实现的接口，
 * 它提供一个介于单一继承和多重继承的中间地带，可以在其它类中混入它们，这样就可以用一组特性对类进行增强。
 */
class Dog(val name: String) extends Animal with Friend {
  def walk(speed: Int): Unit = {
  }
}

class Cat(val name: String) extends Animal {
  def walk(speed: Int): Unit = {
  }
}

trait Flyable {
  def hasFeather = true
  def fly
}
trait Swimable {
  def swim
}

class FishEagle extends Animal with Flyable with Swimable {
  def walk(speed: Int) = println("fish eagle walk with speed " + speed)
  def swim() = println("fish eagle swim fast")
  def fly() = println("fish eagle fly fast")
}

object Main extends App {
  val scat = new Cat("cat") with Friend

  println("scat:" + scat)

  val fishEagle = new FishEagle
  val flyable: Flyable = fishEagle
  flyable.fly

  val swimmer: Swimable = fishEagle
  swimmer.swim
}