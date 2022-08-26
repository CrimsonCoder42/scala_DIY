object Exceptions extends App {

//  try println(1/0)
//  catch {
//    case e: ArithmeticException =>
//      println(Console.RED + e.getMessage + Console.RESET)
//  }

//  can also be done as a variable

  val result =
    try 1 / 0
    catch {
      case e: ArithmeticException => 0
    }
    finally println("No worries it's all good")

  print(result)

}
