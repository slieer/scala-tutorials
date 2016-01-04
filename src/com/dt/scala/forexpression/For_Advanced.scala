package com.dt.scala.forexpression
/**
 * @author Wang Jialin
 * Date 2015/8/16
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 * ΢�Ź����˺ţ�DT_Spark
 */


object For_Advanced {

  def main(args: Array[String]) {}
  
  def map[A, B](list: List[A], f: A => B): List[B] =
		  for(element <- list) yield f(element)
  def flatMap[A, B](list: List[A], f: A => List[B]): List[B] =
		  for(x <- list; y <- f(x)) yield y
  def filter[A](list: List[A], f: A => Boolean): List[A] =
		  for(elem <- list if f(elem)) yield elem
}