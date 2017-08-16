package kuaixue.scala.book.chapter3

/**
 * 定长数组
 */
object Arr extends App {
  def fixedArray() = {
    val nums = new Array[Int](10)
    val s = Array("hello", "world")

    nums(0) = 1
    //java.lang.ArrayIndexOutOfBoundsException
    //s(3) = "Test"

    nums(1) = -100
    printf("%d", nums.apply(1))
    
    Array("a1", "a2", "a3").foreach((a: String) => print(a + ' '))
    Array("a4", "a5", "a6").foreach(a => print(a + ' '))
    Array("1", "2", "3").foreach(print)
    for (a <- Array("a1", "a2", "a3")) println(a)
  }

  def varyArray() = {
    import scala.collection.mutable.ArrayBuffer
    val b = ArrayBuffer[Int]()
    b += 1
    b ++= Array(8, 13, 21)
    //b.trimEnd(5)
    b.insert(2, 6)
    b.insert(2, 6, 7, 8, 9)
    b.remove(0)
    println("head:" + b.head)
    println("last:" + b.last)
    println("b.sum:" + b.sum)
    println("b.toArray:" + b.toArray)

    for (e <- b) println(e + ",")
    b.foreach { x => print(x) }
    println("\n")
    b.foreach { x =>
      {
        var xx = x + 10
        print(xx + ",")
      }
    }

    //(0 until (b.length, 2))println()
    val strArr = ArrayBuffer("Mary", "had", "a", "little", "lamb")
    strArr.max
    //ArrayBuffer("Mary", "had", "a", "little", "lamb").max\
    val bb = ArrayBuffer(1,7, 2, 9)
    //val bSorted = bb.sorted(_ < _)
    
    //scala.util.Sorting.stableSort(a, f)
    scala.util.Sorting.quickSort(Array(1,3,3,4,533,46,86))
  }

  fixedArray
  varyArray

}