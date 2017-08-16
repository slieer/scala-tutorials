package kuaixue.scala.book.chapter_10

trait Friend {
  val name: String
  def listen() = println("You frient " + name + " is listening")
}

class Human(val name: String) extends Friend
class Man(override val name: String) extends Human(name)
class Woman(override val name: String) extends Human(name)

class OtherHuman(override val name: String, age :Int) extends Human(name){
  override def listen() = {
    super.listen()
    printf("he age is %d", age) 
  }
}

object FriendTest extends App{
  val f = new Human("persion")
  f.listen()
  
  val man = new Man("xiao")
  man.listen()
  
  val other = new OtherHuman("xiao", 4)
  other.listen()
}