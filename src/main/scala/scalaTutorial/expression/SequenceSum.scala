package scalaTutorial.expression

object SequenceSum extends App {
  def sum1(xs: List[Int]): Int =
    if (xs.isEmpty) 0 else xs.head + sum1(xs.tail)

    
   println(sum1(List(1)))
   println(sum1(List(1,2,3,4)))
}