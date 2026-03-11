//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

data class Student(val fullName: String, var id: Int, var grade: Double)

val students = listOf(
    Student("abdle", 289, 140.0),
    Student("rim", 600, 120.0),
    Student("nour", 342, 76.0),
    Student("yuss", 776, 130.0)
)
//find student
fun getStudentById(id: Int): Student {
    return students.find { it.id == id }!!
}

fun searchInStudents(name: String): Student? {
    return students.find { it.fullName.lowercase() == name.lowercase() }
}
//main function
fun main() {
    println("Please, Enter the student's ID")
    val id = readln().toInt()
    println(getStudentById(id))

    println("Please, Enter the student's name")
    val name = readln()
    println(searchInStudents(name) ?: "the student is not found")
}