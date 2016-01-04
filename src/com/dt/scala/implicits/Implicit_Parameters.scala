package com.dt.scala.implicits
/**
 * @author Wang Jialin
 * Date 2015/7/19
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */
object Context_Implicits{
    implicit val default:String = "Flink"
}
 
object Param{
   def print(content:String)(implicit language:String){
      println(language+":"+content)
   }
}
object Implicit_Parameters {

  def main(args: Array[String]) {
    Param.print("Spark")("Scala")
     
    import Context_Implicits._
    Param.print("Hadoop")
  }
}