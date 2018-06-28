class A {
  def f() : Unit = { println("A") }
  def a() : Unit = { println("a") }
}

trait B {
  def f() : Unit = { println("B") }
  def b() : Unit = { println("b") }
}

class C extends A with B {

  override def f(): Unit = super[A].f()
}

(new C).f()