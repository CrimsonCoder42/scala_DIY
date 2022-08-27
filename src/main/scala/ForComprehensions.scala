object ForComprehensions extends App {

  val evenMoreInteresting =
    (for(c <- 0 to 9)
    yield for (n <- 0 to 8)
      yield c -> n).flatten

  print(evenMoreInteresting)

  println("-" * 50)

  val evenMoreInteresting2 =
    ('a' to 'h').map { c =>
      (0 to 8).map { n =>
        c -> n
      }
    }.flatten

  evenMoreInteresting2.foreach(println)

}
