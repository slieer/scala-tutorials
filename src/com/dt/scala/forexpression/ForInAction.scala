package com.dt.scala.forexpression
/**
 * @author Wang Jialin
 * Date 015/8/15
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
object ForInAction {

  def main(args: Array[String]) {
    val lauren = Person("Lauren", false)
    val rocky = Person("Rocky", true)
    val vivian = Person("Vivian", false, lauren, rocky)
    val persons = List(lauren, rocky, vivian)
    
    val forResult = for {person <- persons; name = person.name; if !person.isMale; child <- person.children}
      yield (person.name, child.name)
    println(forResult)
    
    val content =for(x <- List(1,2,3); y <- List("Hadoop","Spark","Flink")) yield(x,y)
    println(content)
  }

}