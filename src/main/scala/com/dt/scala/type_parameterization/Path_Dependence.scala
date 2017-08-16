package com.dt.scala.type_parameterization
/**
 * @author Wang Jialin
 * Date 2015/7/13
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */

class Outer {
    private val x = 10
    class Inner {
        private val y = x + 10
    }
}
object Path_Dependence {

  def main(args: Array[String]){
    val outer = new Outer
    val inner =  new outer.Inner
    val inner2: outer.Inner = new outer.Inner
    
    val o1 = new Outer
    val o2 = new Outer
    val i: Outer#Inner = new o1.Inner 
        
    
  }

}