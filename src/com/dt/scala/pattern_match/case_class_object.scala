package com.dt.scala.pattern_match
/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
abstract class Person
case class Student(age: Int) extends Person
case class Worker(age: Int, salary: Double) extends Person
case object Shared extends Person

object case_class_object {

  def main(args: Array[String]){
    
    
	  def caseOps(person: Person) =  person match {
		  case Student(age) => println("I am " + age + "years old")
		  case Worker(_, salary) => println("Wow, I got " + salary)
		  case Shared => println("No property")
		  }
	  caseOps(Student(19))
	  caseOps(Shared)
    
    val worker = Worker(29, 10000.1)
	val worker2 = worker.copy(salary = 19.95)
	val worker3 = worker.copy(age = 30)
  }

}