
fun iteratorMain() {
    val you = MyTeacher()
    you.createStudentList()
    you.callStudents()
}

class MyTeacher : Teacher() {
    override fun createStudentList() {
        studentList = StudentList(mutableListOf())
        studentList.add(Student("赤井亮太", 1))
        studentList.add(Student("赤羽里美", 1))
        studentList.add(Student("岡田美央", 0))
        studentList.add(Student("西森俊介", 1))
        studentList.add(Student("中ノ森玲奈", 0))
    }

    override fun callStudents() {
        var index = 0
        while (index < studentList.getLastNum()) {
            println(studentList.getStudentAt(index).toString())
            index += 1
        }
    }
}

abstract class Teacher {
    lateinit var studentList: StudentList

    abstract fun createStudentList()
    abstract fun callStudents()
}

data class Student(
        private val name: String,
        private val sex: Int
)

class StudentList(
        private val students: MutableList<Student>
) {
    private var last: Int = 0

    fun add(s: Student) {
        students.add(s)
        last += 1
    }

    fun getStudentAt(index: Int): Student {
        return students[index]
    }

    fun getLastNum(): Int {
        return last
    }
}
