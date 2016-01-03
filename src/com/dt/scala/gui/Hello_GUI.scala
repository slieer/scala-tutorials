package com.dt.scala.gui
/**
 * @author Wang Jialin
 * Date 2015/7/27
 * Contact Information:
 * WeChat:	18610086859
 * QQ:		1740415547
 * Email: 18610086859@126.com
 * Tel:	18610086859
 */

import scala.swing._

object Hello_GUI extends SimpleSwingApplication{
    def top = new MainFrame {
      title = "Hello GUI"
      contents = new Button {
        text = "Scala => Spark!!!"
      }
    }
}