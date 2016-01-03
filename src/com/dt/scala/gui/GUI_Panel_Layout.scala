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
import scala.swing.event.ButtonClicked
object GUI_Panel_Layout extends SimpleSwingApplication{
	def top = new MainFrame {
      title = "Second GUI"
      val button = new Button {
        text = "Scala"
      }
      val label = new Label {
        text = "Here is Spark!!!"
      }
      contents = new BoxPanel(Orientation.Vertical) {
        contents += button
        contents += label
        border = Swing.EmptyBorder(50, 50, 50, 50)
      }
      
      listenTo(button)
      var clicks =0 
      reactions += {
        case ButtonClicked(button) => {
          clicks += 1
          label.text = "Clicked " + clicks + " times"
          
        }
      }
    }
  

}