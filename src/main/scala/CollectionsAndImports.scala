object CollectionsAndImports extends App {

  val fruits = Array("apple", "orange", "banana")
  // rectangular brackets are for generics in Scala
//  println(fruits.apply(2))


  fruits(2) = "melon"

//  println(fruits.apply(2))

//  fruits.foreach(println)

//    fruits.map(_.reverse).foreach(println)
//    fruits.foreach(println)

//  collections

//  import scala.collection.mutable
//
//  val bla = mutable.ArraySeq(1,2,3)
//  println(bla)
//
//  object MyStuff {
//    val inside = 1337
//  }
//
//  import MyStuff.inside
//
//  println(inside)

//  println(Iterable(1,2,3))
//
//  println(Seq(1,2,3))
//  println(List(1,2,3))
//  println(IndexedSeq(1,2,3))
//  println(Vector(1, 2, 3))
//  println(Set(1, 2, 3))
//  println(scala.collection.immutable.HashSet(1,2,3,3,2,1))

    //List(1,2,3).map(_ + 1).foreach(println)

//    List(1,2,3)
//      .filter(_ % 2 !=0)
//      .foreach(println)
//
//    List(1,2,3)
//      .flatMap { n =>
//      if(n % 2 == 0)
//        List.empty
//      else
//        List(n)
//
//    }
//      .foreach(println)

//  val matrix: Unit =
//    List.apply(
//      List(1,2,3),
//      List(4,5,6),
//      List(7,8,9)
//    )

//    matrix.foreach(println)

// Map

//  println(Map((1, "I"),(2, "II"), (3, "III")))
//  println(Map((1 -> "I"),(2 -> "II"), (3 -> "III")))

  Map((1 -> "I"),(2 -> "II"), (3 -> "III")).map { tuple2 =>
    val key = tuple2._1
    val value = tuple2._2

    key -> value.toLowerCase
  }
    .foreach(println)

  println("-" * 50)

  // Ranges

  Range(start = 0, end = 10).foreach(println)
  println("-" * 50)
  Range(start = 0, end = 10, step = 2).foreach(println)
  println("-" * 50)
  0 until 10 by 2 foreach println
  println("-" * 50)
  0 to 9 by 2 foreach(println)


}
