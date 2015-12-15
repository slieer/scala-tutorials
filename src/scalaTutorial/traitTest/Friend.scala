package scalaTutorial.traitTest

trait Friend {
  val name: String
  def listen() = println("You frient " + name + " is listening")
}

class Human(val name: String) extends Friend
class Man(override val name: String) extends Human(name)
class Woman(override val name: String) extends Human(name)
