package com.dt.scala.oop

/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
class AbstractClassOps{
	var id : Int = _
}
abstract class SuperTeacher(val name : String){
  var id : Int
  var age : Int
  def teach
}

class TeacherForMaths(name : String) extends SuperTeacher(name){
  
  override var id = name.hashCode()
  override var age = 29
  override def teach{
    println("Teaching!!!")
  }
}


object AbstractClassOps{
  def main(args: Array[String]) {
	  val teacher = new TeacherForMaths("Spark")
	  teacher.teach
	  
	  println("teacher.id" + ":" + teacher.id)
	  println(teacher.name + ":" + teacher.age)
    
  }
}