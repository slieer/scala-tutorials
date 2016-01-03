package com.dt.scala.oop
/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
package com.scala.spark  
package object people {  
  val defaultName = "Scala"  
}  

package people {  
class people {  
  var name = defaultName 
}  
} 

import java.awt.{Color,Font}
import java.util.{HashMap=>JavaHashMap}
import scala.{StringBuilder => _}




class PackageOps {}


package spark.navigation {
  abstract class Navigator{
    def act
  }
  package tests {
    
    // spark.navigation.tests
    class NavigatorSuite
  }
  
  package impls {
    class Action extends Navigator{
      def act = println("Action")
    }
  }
}

package hadoop {
  package navigation {
    class Navigator
  }
  
  package launch {
    class Booster {
      val nav = new navigation.Navigator
      
    }
  }  
}

 


object PackageOps {

  def main(args: Array[String]): Unit = {

  }

}