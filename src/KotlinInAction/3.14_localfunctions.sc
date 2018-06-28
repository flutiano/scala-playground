
class User(val id: Int, val name: String, val address: String)

def saveUser(user: User) = {

  def validate(value: String, fieldName: String) = {

    if (value.isEmpty()) {
      throw new IllegalArgumentException(
        s"Can't save user ${user.id}: " +
        s"empty $fieldName")
    }
  }

  validate(user.name, "Name")
  validate(user.address, "Address")

  // Save user to the database
}

try {
  saveUser(new User(1, "", ""))
} catch {
  case ex: IllegalArgumentException => print(ex)
}


object {
    var x: Int = 0
    var y: Int = 0
}
