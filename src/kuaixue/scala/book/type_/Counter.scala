package kuaixue.scala.book.type_

import scala.beans.BeanProperty

class Counter {
  private var privVar:Int = 10
  
  private val privVal:Int = 10
  
  @BeanProperty
  var value = 0
  
  def increment(){
    value += 1
  }
  
  def current() = value
}