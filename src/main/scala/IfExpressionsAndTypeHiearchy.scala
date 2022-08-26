object IfExpressionsAndTypeHiearchy  extends App {


//  val result =
//  if (true && true)
//    "good"
//  else
//    "bad"
//
//
//  // NO TERNARY OPERATORS
//
//  val result2 = if (false) 5 else "bad"
//
//  println(result2)

//  def wannaWatchAMovieOrGoForIceCream(
//      movie: Boolean,
//      iceCream: Boolean
//      ): String =
//    if (movie && iceCream)
//      "awesome"
//    else if (movie || iceCream)
//    "still cool"
//    else
//    "boring"
//
//  println(wannaWatchAMovieOrGoForIceCream(movie = false, iceCream = false))
//  println(wannaWatchAMovieOrGoForIceCream(movie = false, iceCream = true))
//  println(wannaWatchAMovieOrGoForIceCream(movie = true, iceCream = false))
//  println(wannaWatchAMovieOrGoForIceCream(movie = true, iceCream = false))

  def wannaWatchAMovieOrGoForIceCream(
      movie: Boolean,
      iceCream: Boolean
      ): String =
    if (movie && iceCream) {
      println("if (movie && iceCream)")

      "awesome"

    } else if (movie || iceCream) {
      println("else if (movie || iceCream)")

      "still cool"
    } else {
      println("else")

      "boring"
    }

  println(wannaWatchAMovieOrGoForIceCream(movie = false, iceCream = false))
  println()

  println(wannaWatchAMovieOrGoForIceCream(movie = false, iceCream = true))
  println()

  println(wannaWatchAMovieOrGoForIceCream(movie = true, iceCream = false))
  println()

  println(wannaWatchAMovieOrGoForIceCream(movie = true, iceCream = false))
  println()

}
