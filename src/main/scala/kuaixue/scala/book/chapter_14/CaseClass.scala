package kuaixue.scala.book.chapter_14

abstract class Expr
case class Var(name: String) extends Expr{
  
}
case class Number(num: Double) extends Expr{
  
}
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

object CaseClass extends App {
  val x = Var("x")
  val op = BinOp("+", Number(1), x)

  println(op)

  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", e, Number(1)) => e
    case _ => expr

  }

  simplifyTop(UnOp("-", UnOp("-", Var("x"))))
}