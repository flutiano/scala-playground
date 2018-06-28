def returnAnObj() = {
  object Accounts {
    private var lastNumber = 0

    def newUniqueNumber() = {
      lastNumber += 1; lastNumber
    }
  }

  Accounts
}

val acc1 = returnAnObj()
acc1.newUniqueNumber()
acc1.newUniqueNumber()
val acc2 = returnAnObj()
acc2.newUniqueNumber()
acc1.newUniqueNumber()


object Hello extends App {
  println("Hello, World!")
}

Hello.main(null)

object TrafficLightColor extends Enumeration {
  type TrafficLightColor = Value
  val Red, Yellow, Green = Value
}

for (c <- TrafficLightColor.values) println(s"${c.id}: $c")

import TrafficLightColor._

def doWhat(color: TrafficLightColor) = {
  if (color == Red) "stop"
  else if (color == Yellow) "hurry up"
  else "go"
}

doWhat(Red)
