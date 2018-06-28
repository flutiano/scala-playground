class Class {

  print(1);

  def this(i: Int) {
    this()
    print(2);
  }

  print(3);

  def this(s: String) {
    this(s.toInt);
    print(4);
  }

  print(5);

  def this(f: Double) {
    this(f.toInt.toString);
    print(6);
  }

  print(7);
}

new Class()
println()
new Class(1)
println()
new Class("1")
println()
new Class(1.0)