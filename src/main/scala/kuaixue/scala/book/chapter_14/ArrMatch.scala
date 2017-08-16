package kuaixue.scala.book.chapter_14

object ArrMatch {

  def matchType(args: Array[String]): Unit = {
    def match_type(t: Any) = t match {
      case p: Int => println("It is Integer")
      case p: String => println("It is String")
      case m: Map[_, _] => m.foreach(println)
      case _ => println("Unknown type!!!")
    }
  }

  def matchArr(arr: Array[Int]): String = {
    arr match {
      case Array() => "0 size"
      //0 Array
      case Array(0) => "0"
      //double element Array
      case Array(x, y) => x + " " + y
      //0 start Array
      case Array(0, _*) => "0 ..."

      //other
      case _ => "something else 0"
    }
  }

  def matchArr1(arr: Any) = arr match {
    case Array(0) => println("Array" + "0")
    case Array(x, y) => println("Array" + x + " " + y)
    case Array(0, _*) => println("Array" + "0 ...")
    case _ => println("something else 1")
  }

  def matchArr2(lst: Any) = lst match {
    case 0 :: Nil => println("List:" + "0")
    case x :: y :: Nil => println("List:" + x + " " + y)
    case 0 :: tail => println("List:" + "0 ...")
    case _ => println("something else 2")
  }

  def matchArr3() = {
    val lst: Any = Array(1, 23, 2, 3, 5, 8, 11)

    lst match {
      case 0 :: Nil => "0"
      case x :: y :: Nil => x + " " + y
      case 0 :: tail => "0 ..."
      case _ => "something else 3"
    }
  }

  def main(args: Array[String]) {
    var a = Array[Int](1,2,3,34,2)
    println(matchArr(a))
    println(matchArr1(a))
    println(matchArr2(a))
    println(matchArr3)
  }
}