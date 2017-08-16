package kuaixue.scala.book.chapter2

import java.net.URL

object Try {
  var in = new URL("http://horstmann.com/fred.gif")
  in.openConnection()
}