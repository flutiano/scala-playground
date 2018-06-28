
class User(val nickname: String,
           val isSubscribed: Boolean = true)

class Constructors {

  println("Init block")

  def this(i: Int)  {
    this()
    println("Constructor")
  }
}

val alice = new User("Alice")
println(alice.isSubscribed)
val bob = new User("Bob", false)
println(bob.isSubscribed)
val carol = new User("Carol", isSubscribed = false)
println(carol.isSubscribed)

new Constructors(1)
