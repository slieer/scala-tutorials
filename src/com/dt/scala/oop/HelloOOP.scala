package com.dt.scala.oop

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
class Person {
  private var age = 0
  def increment(){age += 1}
  def current = age
  
  def act(person: Person){
    person.age
  }
    
  
}

class Student{
  private var privateAge = 0
  val name = "Scala"
  def age = privateAge  
  
  def isYounger(other: Student) = privateAge < other.privateAge
}

object HelloOOP {

  def main(args: Array[String]): Unit = {
    val person = new Person()
    person.increment()
    person.increment()
    println(person.current)
//    
//    val student = new Student
//    student.age = 10
//    println(student.age)
    
    val student = new Student
    println(student.name)
    
  }

}