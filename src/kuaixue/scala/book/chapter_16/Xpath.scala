package kuaixue.scala.book.chapter_16

import scala.io.Source
import scala.io.BufferedSource

object Xpath extends App {
  val url = "http://planet.jboss.org/post/scaling_microservices"
  val buf = Source.fromURL(url);
  
}