object HigherOrderFunctions extends App {

  def higherOrderFunction(f: (Int) => String): Unit = {
    var acc = 0

    while (acc < 10) {
      println(acc)

      acc += 1
    }
  }

  def rendered(n: Int): String =
    Console.YELLOW + n + Console.RESET

  //higherOrderFunction(rendered)

//  List(1,2,3).foreach[Unit](println)

  val f1: Int => String = rendered
  val f2 = rendered _

  // functional literals
  val f3 = x => rendered(x)
  val f4 = rendered(_)

  def function(n: Int): String = n.toString
  val bla = function

  println(
    List(6,2,5,9,8).sortWith((a,b) => a <= b)
  )

  println(
    List(6, 2, 5, 9, 8).sortWith((a, b) => a <= b)
  )


}
