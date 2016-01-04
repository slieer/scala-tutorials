package com.dt.scala.type_parameterization
/**
 * @author Wang Jialin
 * Date 2015/7/14
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
class Structural { def open()=print("A class instance Opened") }

object Structural__Type {

  def main(args: Array[String]){
    init(new { def open()=println("Opened") })
    type X = { def open():Unit }
    def init(res:X) = res.open
    init(new { def open()=println("Opened again") })
    
    object A { def open() {println("A single object Opened")} }
    init(A)
    
    val structural = new Structural
    init(structural)
    
  }

  def init( res: {def open():Unit} ) { 
            res.open 
        }
}