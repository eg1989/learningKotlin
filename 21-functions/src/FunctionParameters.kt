fun main(args: Array<String>) {
    for (i in 1..10) {
        double(i)
    }
    double(36, "36 * 2 = ")
    sayHello(listOf("Anna", "Bob", "Carol"))
}

fun double(number: Int, message: String = "Double is") {
    println("$message ${number * 2}")
}

fun sayHello(people: Collection<String>) {
    for (person in people) {
        println("Hi $person")
    }
}
