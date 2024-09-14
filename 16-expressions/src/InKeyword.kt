fun main(args: Array<String>) {
    val favoritePet = "dog"
    val availablePets = setOf("dog", "cat", "horse")

    if (favoritePet in availablePets) {
        println("We have your next best friend")
    } else {
        println("Sorry, we do not have a $favoritePet")
    }

    val coffee = "cappuccino"
    val availableCoffee = listOf("cappuccino", "mocha", "cafe au-lait")

    if (coffee !in availableCoffee) {
        println("Sorry, we do not have a $availableCoffee")
    } else {
        println("Bon appetit!")
    }

    print("Please enter a number: ")
    val input = readLine() ?: "0"
    val number = input.toInt()
    if (number !in 0..9) {
        println("Your number is not a single digit")
    } else {
        println("Your number is a single digit")
    }
}
