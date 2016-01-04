/**
 *
 */
package com.dt.scala.type_parameterization

import java.util.Comparator



/**
 * @author Wang Jialin
 * Date 2015/7/6
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */

class Pair_Ordering[T : Ordering] (val first : T, val second : T){
  def bigger(implicit ordered: Ordering[T]) = {
    if (ordered.compare(first, second) > 0) first else second
  }
}

object Context_Bounds {

  def main(args: Array[String]) {
    
    val pair = new Pair_Ordering("Spark", "Hadoop")
    println(pair.bigger)
    
    val pairInt = new Pair_Ordering(3, 5)
    println(pairInt.bigger)

  }
   
}