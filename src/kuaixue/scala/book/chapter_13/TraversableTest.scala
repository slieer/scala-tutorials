package kuaixue.scala.book.chapter_13

import scala.reflect.io.File

/**
 *
 * trait Traversable[+A] extends TraversableLike[A, Traversable[A]]
 * with GenTraversable[A]
 * with TraversableOnce[A]
 * with GenericTraversableTemplate[A, Traversable] {}
 *
 */
class FileLineTraversable(file: File) extends Traversable[String] {
  def foreach[U](f: String => U): Unit = {

  }
  
  override def toString: String = {
    ""
  }
}

object TraversableTest {

}