

object Ch04_1_Arr extends App {
  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

  for (i <- 0 to 2)
    print(greetStrings(i))

  greetStrings.update(0, "Hi")
  greetStrings.update(1, ", ")
  greetStrings.update(2, "the world!\n")
  for (i <- 0.to(2))
    print(greetStrings.apply(i))
    
    
  def printArgs(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg)
  }

  def printArgs_1(args: Array[String]): Unit = {
    args.foreach(println)
  }

  printArgs(greetStrings)
}