package kuaixue.scala.book.chapter5

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

class NetWork(val name: String) {  
  outer =>  
  class Member(val name: String) {  
    
    def description = name + " inside " + outer.name  
  }  
} 


object Person extends App{
  new P("namePlus")
  

}