import java.io.File

import scala.collection.mutable.ArrayBuffer
import scala.util.Random
import scala.collection.{SortedMap, mutable}

//val out = new java.util.Formatter(new File("./whereareu.txt"))
//out.flush()
//out.close()

// Using immutable map
//var wordCounter = SortedMap[String, Int]()
//
//val in = new java.util.Scanner(new java.io.File("myfile.txt"))
//while (in.hasNext()) {
//  val word = in.next().toUpperCase
//  wordCounter += (word -> (wordCounter.getOrElse(word, 0) + 1))
//}
//in.close()
//for ((w,c) <- wordCounter) print(s"$w: $c; ")

// Using mutable map
//val wordCounter2 = mutable.SortedMap[String, Int]()
//
//val in2 = new java.util.Scanner(new java.io.File("myfile.txt"))
//while (in2.hasNext()) {
//  val word = in2.next().toUpperCase
//  wordCounter2 += (word -> (wordCounter2.getOrElse(word, 0) + 1))
//}
//in2.close()
//for ((w, c) <- wordCounter2) print(s"$w: $c; ")

// Ex4.8

def minmax(values: Array[Int]) = {
  (values.min, values.max)
}

def randomArray(n: Int) = {
  val rand = new Random()
  val a = new Array[Int](n)
  for (i <- a.indices) a(i) = rand.nextInt(n)
  a
}

minmax(randomArray(5))

("Hello".zip("World")).toMap