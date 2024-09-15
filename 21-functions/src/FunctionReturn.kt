fun main(args: Array<String>) {
    val r = 5
    val r2 = 7
    println("A circle with radius $r has an area of ${calculateCircleArea(r)}")
    println("A circle with radius $r2 has an area of ${calculateCircleAreaShorthandReturn(r2)}")

    val clients = listOf("Anna", "Bob", "William")
    for (client in clients) {
        println(personalisedGreeting(client))
    }
}

fun calculateCircleArea(radius: Int) : Double {
    val pi = 3.14159
    return pi * radius * radius
}

fun calculateCircleAreaShorthandReturn(radius: Int) = 3.14159 * radius * radius

fun personalisedGreeting(person: String): String {
    val greeting = when(person[0]) {
        'A' -> "Are you ok $person"
        'W' -> "What's up $person"
        else -> "Hi $person"
    }
    return greeting
}
