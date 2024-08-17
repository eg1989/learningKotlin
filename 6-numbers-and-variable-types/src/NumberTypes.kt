fun main(args: Array<String>) {
    val items = 5
    println("items: $items")
    println("Type of items: ${items::class.java}\n")

    val numberOfPeople = 7_500_000_000
    println("numberOfPeople: $numberOfPeople")
    println("Type of numberOfPeople: ${numberOfPeople::class.java}\n")

    val price = 29.99
    println("price: $price")
    println("Type of price: ${price::class.java}\n")

    val pi = 3.1415926535
    println("pi: $pi")
    println("Type of pi: ${pi::class.java}\n")

}
