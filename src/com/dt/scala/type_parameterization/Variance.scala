package com.dt.scala.type_parameterization
/**
 * @author Wang Jialin
 * Date 015/7/10
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
class Person
class Student extends Person
class C[+T](val args: T)
class S[+T](arg : T) extends C[T](arg)
trait Friend[-T]{
  def makeFriend(somebody: T)
}

object Variance {
  def makeFriendWithYou(s: Student, f: Friend[Student]){f.makeFriend(s)}
  def main(args: Array[String]) {
    val value : C[Person] = new C[Student](new Student)

//    List<? extends Oject> list = new ArrayList<String>()
    val list : List[_ <: Any] = List[String]("Spark")
  }

}