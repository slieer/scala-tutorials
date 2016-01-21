package scalaTutorial.expression

object Expr {
  def createErrorMessage(errorCode: Int): String = {
    val result = errorCode match {
      case 1 => "Network Failure"
      case 2 => "I/O Failure"
      case 3 => "Unknown Error"
    }

    return result
  }

  def createErrorMessage_v1(errorCode: Int): String = {
    errorCode match {
      case 1 => "Network Failure"
      case 2 => "I/O Failure"
      case 3 => "Unknown Error"
    }
  }

  def createErrorMessage_v2(errorCode: Int): String =
    errorCode match {
      case 1 => "Network Failure"
      case 2 => "I/O Failure"
      case _ => "Unknown Error"
    }

}

object Match extends App {
  Expr.createErrorMessage_v2(1)
}
