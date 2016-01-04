package com.dt.scala.type_parameterization
/**
 * Author: 	Wang Jialin 
 * Date 2015/7/6
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */

//class Pair_NotPerfect[T <: Comparable[T]](val first : T,val second : T){
//  def bigger = if(first.compareTo(second) > 0)first else second  
//}
class Pair_NotPerfect[T <% Comparable[T]](val first : T,val second : T){
	def bigger = if(first.compareTo(second) > 0)first else second  
}

class Pair_Better[T <% Ordered[T]](val first : T,val second : T){
	def bigger = if(first > second)first else second  
}



object View_Bounds {

  def main(args: Array[String]) {
    
    
    val pair = new Pair_NotPerfect("Spark", "Hadoop")
    println(pair.bigger)
    
    val pairInt = new Pair_NotPerfect(3, 5) //Int -> RichInt
    println(pairInt.bigger)
    
    val pair_Better_String = new Pair_Better("Java", "Scala") //String -> RichString
    println(pair_Better_String.bigger)
    
    val pair_Better_Int = new Pair_Better(20, 12)
    println(pair_Better_Int.bigger)

    
  }

}