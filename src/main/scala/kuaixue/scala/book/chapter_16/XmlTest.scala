package kuaixue.scala.book.chapter_16

object xml extends App {
  val doc = <html lang="zh-cn"><head><title>Fred's Memoris</title></head></html>
  val items = <li>Fred</li><li>Widma</li>

  println(doc)
  println(items)

  val (x, y) = (1, 2)
  x < y
  doc.child.foreach { x => println(x) }
  doc.attributes.foreach { x =>
    {
      println(x.get(x.key))

    }
  }
  items.foreach { x =>
    {
      println(x)
    }
  }
  
  println(doc.attributes("lang"))
  doc.attributes.asAttrMap
}