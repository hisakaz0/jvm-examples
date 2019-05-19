
fun <T> max(collection: Collection<T>, less: (T, T) -> Boolean): T? {
    var max: T? = null
    for (it in collection) {
        if (max == null || less(max, it)) {
            max = it
        }
    }
    return max
}

infix fun Int.mul(next: Int) = this * next

data class Person(
        val firstName: String,
        val lastName: String
) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::firstName, Person::lastName)
    }
}


infix fun <T> List<T>.has(target: T): Boolean {
    this.forEach { if (it == target) return true }
    return false
}


fun main(args: Array<String>) {
    // (0..10).forEach { println(it) } // 0, 1, 2, 3,
    val strings = listOf("a", "b", "c")
    println(max(strings, { a, b -> a.length < b.length }))

    println(1 mul 2 mul 3 mul 4)

    val ints = listOf(1, 2, 3, 4)
    val sum = ints.reduce { acc, i ->  acc + i }
    println(sum)

    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 < p2)

    val l = listOf(1, 2, 3, 4)
    println(if (l has 5) "has 5" else "not has 5")
}

