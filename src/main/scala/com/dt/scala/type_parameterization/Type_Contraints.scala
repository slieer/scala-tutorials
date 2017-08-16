
package com.dt.scala.type_parameterization

/**
 * @author Wang Jialin
 * Date 2015/7/9
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */

object Type_Contraints {

  def main(args: Array[String]){
    //A =:= B  // 
    //A <:< B  //
    def rocky[T](i:T)(implicit ev: T <:< java.io.Serializable) {
      print("Life is short,you need spark!") }
    rocky("Spark")
  
    
    
  }

}