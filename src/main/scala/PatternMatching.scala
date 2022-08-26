object PatternMatching extends App {

  def higherOrderFunction(f: (Int) => String): Unit = {
    var acc = 0

    while (acc < 10) {
      println(acc)

      acc += 1
    }
  }

  println{
    "Hello World"
  }
   // partial functions

//   higherOrderFunction {
//     case x => Console.MAGENTA + x + Console.RESET
//   }

  higherOrderFunction {
        // guard pattern
    case x if x % 2 == 0 => Console.MAGENTA + x + Console.RESET
  }



}
