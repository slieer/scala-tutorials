package kuaixue.scala.book.type_

class Person {
  private var name = ""
  private var age = 0
  
  def this(name: String) {
    this()
    
    this.name = name
  }
  
  def this(name:String, age: Int){
    this()
    this.name = name
    this.age = age
  }
}

class P(name:String= "", age:Int=0, addr:String="", phone:String=""){
  
}

object Person extends App{
  new P("namePlus")
}