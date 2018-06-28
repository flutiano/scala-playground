class Counter {
  private var value = 0 // You must initialize the field
  def increment() { value += 1 } // Methods are public by default
  def current() = value
}

val myCounter = new Counter
myCounter.increment()
myCounter.current

//class Person {
//  private var privateAge = 0 // Make private and rename
//
//  def age = privateAge
//  def age_=(newValue: Int) {
//    if (newValue > privateAge) privateAge = newValue; // Can’t get younger
//  }
//}

//val fred = new Person
//fred.age = 30
//fred.age = 21
//println(fred.age) // 30

import javax.print.attribute.standard.PrinterMoreInfoManufacturer

import scala.beans.BeanProperty
import scala.collection.mutable.ArrayBuffer

class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}

val chatter = new Network
val myFace = new Network

val fred = chatter.join("Fred")
val wilma = chatter.join("Wilma")
fred.contacts += wilma
val barney = myFace.join("Barney")
//barney.contacts += wilma

// Ex5.2
class BankAccount {
  private var _balance: Double = 0;

  def balance = _balance

  def deposit(amount: Double): Unit = {
    _balance += amount
  }

  def withdraw(amount: Double): Unit = {
    _balance -= amount
  }
}

val acc = new BankAccount
acc.deposit(100)
acc.balance
acc.withdraw(45.9)
acc.balance

// Ex5.3, 5.4
class Time(val hours: Int, val minutes: Int) {

  private var minutesSinceMidnight: Int = 0;

  if (!(hours >= 0 && hours < 24))
    println("Hours should be between 0 and 23!")
  else if (!(minutes >= 0 && minutes < 60))
    println("Minutes should be between 0 and 59")
  else {
    minutesSinceMidnight = hours * 60 + minutes
    println(s"minutesSinceMidnight = $minutesSinceMidnight")
  }

  def before(other: Time) =
    if (minutesSinceMidnight < other.minutesSinceMidnight) true else false
}

val t1 = new Time(22, 10)
val t2 = new Time(23, 5)
t1.before(t2)
t1.before(new Time(12, 35))
t1.before(new Time(22, 5))
t1.before(new Time(22, 15))

// Ex5.5
class Student(@BeanProperty var name: String, @BeanProperty var id: Long)

val student = new Student("jeffz", 123456)
student.name
student.name = "JD"
student.name
student.setId(654321)
student.getId()

// Ex5.6
class Person(private var _age:Int = 0) {

  if (_age < 0) _age = 0

  def age = _age
  def age_=(newValue: Int) {
    if (newValue > _age) _age = newValue;
  }
}


val p1 = new Person(-1)
p1.age
val p2 = new Person()
p2.age = -2
p2.age = 2

// Ex5.7
{
  class Person(_fullName: String) {
    val (firstName, lastName) =  _fullName.split(" ") match {
      case Array(x:String, y:String, _*) => (x,y)
      case _ => (null,null)
    }

    override def toString: String = s"first name: $firstName; second name: $lastName"
  }

  val p1 = new Person("Jeff Zhao")
  p1.toString
}

object Ex07 extends App {

  /*
  Primary constructor parameter should be a plain parameter
   */
  class Person(_fullName:String) {
    val (firstName, lastName) =  _fullName.split(" ") match {
      case Array(x:String, y:String, _*) => (x,y)
      case _ => (null,null)
    }
  }

  val FredSmith = new Person("Fred Smith")

  assert( FredSmith.firstName == "Fred" )
  assert( FredSmith.lastName == "Smith" )
}

// Ex 5.8
class Car(val manufacturer: String, val model: String, val modelYear: Int = -1, var licensePlate: String = "")

val car = new Car("Peogeot", "307")
car.model

val car2 = new Car("Peogeot", "307", 2008)
car2.licensePlate

val car3 = new Car("Peogeot", "307", licensePlate = "5921")
car3.licensePlate

// Ex 5.10
class Employee {
  val name: String = "jeff zhao"
  val salary: Double = 0.0
}