import scala.annotation.tailrec

object LoopsAndTailRecursion extends App {


  @tailrec
  def loop(acc: Int = 0): Unit =
    if(acc < 10) {
      println(acc)

      loop(acc + 1)
    }
  //loop() // <- make sure the call is outside of the function

  // below is the while loop equal.

  def interesting(): Unit = {

    var acc = 0
    while (acc < 10 ) {
      println(acc)

      acc += 1
    }
  }

  interesting()

}
