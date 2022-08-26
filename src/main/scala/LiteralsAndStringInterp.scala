object LiteralsAndStringInterp extends App {

//  val a1 = 0xf
//  println(a1)


  val a2 = 1234_567
  println(a2)

  val a3 = 123456789987654321L  // <- L on the end is a long
  println(a3)

  val a4 = 123456789987654321f  // <- f on the end is a float
  println(a4)

  val a5 = 123456789987654321d  // <- d on the end is a Double
  println(a5)


  // single quotes are always Char

  println('a')
  println('A')
  println('\n')


  // double quotes for Strings

  println(
    "Hello" + " " + "World"
  )

  println(
    "Hello\n" + " " + "World"
  )

// s interpolation
  val myFavoriteNumber = 42
  println(s"This is my favorite number: $myFavoriteNumber")


// f interpolation
  val myFavNumber = 42
  println(
    f"This is my favorite number + 2: ${myFavNumber + 2}%d ${myFavNumber + 2}%8.2f"
  )




}
