package com.dt.scala.function

import javax.swing.JButton
import java.awt.event.ActionListener
import java.awt.event.ActionEvent
import javax.swing.JFrame
/**
 * Author: 	Wang Jialin
 * Contact Information:
 * 	WeChat:	18610086859
 *  QQ:		1740415547
 * 	Email: 18610086859@126.com
 *  Tel:	18610086859
 */
object SAM {

  def main(args: Array[String]){
    
    var data = 0
    val frame = new JFrame("SAM Testing");
	val jButton = new JButton("Counter")
//	jButton.addActionListener(new ActionListener {
//	  override def actionPerformed(event: ActionEvent) {
//	    data += 1
//	    println(data)
//	  }
//	})
	
	implicit def convertedAction(action: (ActionEvent) => Unit) = 
	  new ActionListener {
	    override def actionPerformed(event: ActionEvent) { action(event) }
	}
//	
	jButton.addActionListener((event: ActionEvent) => {data += 1; println(data)})
	    
    frame.setContentPane(jButton);   
    frame.pack();  
    frame.setVisible(true);  
  }

}