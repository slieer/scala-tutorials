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
object Evidence {

  def main(args: Array[String]) {
    def evidence[T](i:T)(implicit ev: T <:< java.io.Serializable) { print("Spark!!!") }
    evidence("Spark")
//    test(140)
  }

}