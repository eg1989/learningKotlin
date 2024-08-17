fun main(args: Array<String>) {
    // You have the following translation of numbers in french
    val count = hashMapOf(
        Pair(1, "un"),
        Pair(2, "deux"),
        Pair(3, "trois")
    )

    // Print out how you would translate 2
    println("2 in french means: ${count[2]}")

    // What about 3.
    println("3 in french means: ${count.get(3)}")

    // Add the translation for 4 => "quatre"
    count[4] = "quatre"
    println(count)

    // ---

    // You have a map of customers with how many products they have bought
    val customers = mapOf(
        Pair("John", 1),
        Pair("Alice", 5),
        Pair("Bob", 3),
    )

    // Is "Alice" a customer? How many products did they buy?
    println("Is \"Alice\" a customer?: ${customers.containsKey("Alice")}")  // true
    println("Alice bought ${customers["Alice"]} products")    // 5

    // Is "Michael" a customer?
    println("Is \"Michael\" a customer?: ${customers.containsKey("Michael")}") // false
}
