fun main(args: Array<String>) {
    println("args: $args")
    // Immutable variable
    val name: String = "John"

    // Mutable variable
    var age: Int = 25

    // nullable variable
    var job: String? = null

    println("Hello world", name, age)

    // for loop
    for (i in 1..5) {
        println("current iteration: $i")
    }

    // while loop
    var count = 0
    while (count < 5) {
        println("current (while) iteration: $count")
        count++
    }

    // do while loop
    do {
        println("current (do-while) iteration: $count")
        count++
    } while (count < 0)

    println(add(1, 2), " : add(1, 2)")
}

fun add(a: Int, b: Int): Int {
    return a + b
}
