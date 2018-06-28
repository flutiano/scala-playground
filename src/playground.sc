import java.time.LocalDate

import scala.collection.mutable.ArrayBuffer

//def productOfUnicodes(str: String) = {
//  str.map(_.toLong).product
//}
//
//productOfUnicodes("Hello")
//
//def productOfUnicodesRec(str: String): Long = {
//  if (str.length() == 0)
//    1
//  else
//    str.head.toLong * productOfUnicodesRec(str.tail)
//}
//
//productOfUnicodesRec("Hello")
//
//def power(base: Float, n: Int): Double = {
//  if ( n == 0)
//    1.0
//  else if ( n < 0)
//    1.0 / power(base, -n)
//  else if (n % 2 == 0) {
//    val y = power(base, n/2)
//    y * y
//  } else {
//    base * power(base, n - 1)
//  }
//}
//
//power(10, 3)
//power(10, -3)
//power(10, 4)
//power(10, 0)

//implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
//  def date(args: Any*): LocalDate = {
//    val year = args(0).toString.toInt
//    val month = args(1).toString.toInt
//    val day = args(2).toString.toInt
//    LocalDate.of(year, month, day)
//  }
//}
//
//date"2017-08-01"

val nums = new Array[Int](10)
// An array of ten integers, all initialized with zero
nums(0) = 0
nums(9) = 9

val a = new Array[String](10)
// A string array with ten elements, all initialized with null
val s = Array("Hello", "World")
// An Array[String] of length 2—the type is inferred
// Note: No new when you supply initial values
s(0) = "Goodbye"
// Array("Goodbye", "World")
// Use () instead of [] to access elements

val b = ArrayBuffer[Int]()
// Or new ArrayBuffer[Int]
// An empty array buffer, ready to hold integers
b += 1
// ArrayBuffer(1)
// Add an element at the end with +=
b += (1, 2, 3, 5)
// ArrayBuffer(1, 1, 2, 3, 5)
// Add multiple elements at the end by enclosing them in parentheses
b ++= Array(8, 13, 21)
// ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)
// You can append any collection with the ++= operator
b.trimEnd(5)
// ArrayBuffer(1, 1, 2)
// Removes the last five elements

(1, 2, 3, 5)