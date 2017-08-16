
import scala.collection.mutable.LinkedHashSet

object UnifiedTypes extends App{
  var set = new LinkedHashSet[Any]
  set += "This is a string"
  set += 732
  set += 'c'
  set += true
  set + main _
  
  var iter : Iterator[Any] = set.iterator
  
  while(iter.hasNext){
    println(iter.next().toString())
  }
}