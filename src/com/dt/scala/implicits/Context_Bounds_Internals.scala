package com.dt.scala.implicits
/**
 * @author Wang Jialin
 * Date 2015/7/20
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
class Pair_Implicits[T: Ordering](val first: T, val second: T){ //Ordering[T]
  def bigger(implicit ordered: Ordering[T]) =
    if (ordered.compare(first, second) > 0) first else second
}
class Pair_Implicitly[T: Ordering](val first: T, val second: T){
	def bigger =if (implicitly[Ordering[T]].compare(first, second) > 0) 
			first else second
}
class Pair_Implicitly_Odereded[T: Ordering](val first: T, val second: T){
	def bigger ={
	  import Ordered._
	  if (first > second) first else second
	}	
}
object Context_Bounds_Internals {

  def main(args: Array[String]){
    println(new Pair_Implicits(7, 9).bigger)
    println(new Pair_Implicitly(7, 9).bigger)
    println(new Pair_Implicitly_Odereded(7, 9).bigger)
       
  }

}