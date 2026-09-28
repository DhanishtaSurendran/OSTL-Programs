abstract class Person(val name: String, val age: Int) {

  def introduce(): Unit

  def displayAge(): Unit = {
    println(s"Age: $age")
  }
}

trait SportPlayer {

  def playSport(): Unit = {
    println("Playing football")
  }
}

case class Student(
    override val name: String,
    override val age: Int,
    rollNo: Int
) extends Person(name, age) with SportPlayer {

  def introduce(): Unit = {
    println(s"Name: $name")
    println(s"Roll No: $rollNo")
  }
}

object College {

  def displayCollege(): Unit = {
    println("College: GCT")
  }
}

object Main {

  def main(args: Array[String]): Unit = {

    val student = Student("Dhanishta", 20, 101)

    College.displayCollege()

    student.introduce()

    student.displayAge()

    student.playSport()
  }
}