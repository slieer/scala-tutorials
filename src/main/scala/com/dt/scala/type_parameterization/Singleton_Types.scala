package com.dt.scala.type_parameterization
/**
 * @author Wang Jialin
 * Date 2015/7/12
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
class Animal { def breathe: this.type = this }
class Cat extends Animal { def eat: this.type = this }

object Singleton_Types {

  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.breathe.eat

  }
}