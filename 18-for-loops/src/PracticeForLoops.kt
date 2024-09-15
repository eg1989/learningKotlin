fun main(args: Array<String>) {
    for (i in 1..10) {
        println("Greetings my friend, how are you?")
    }

    var sum = 0
    for (i in 1..100) {
        sum += i
    }
    println("The sum of all numbers from 1 to 100 is $sum")

    val customers = mapOf(
        Pair("Alice", 4),
        Pair("Judy", 8),
        Pair("Anna", 6),
    )

    for (customerKey in customers.keys) {
        println("Customer $customerKey, you have made ${customers[customerKey]} purchases in total")
    }
}
