fun main(args: Array<String>) {
    // You have a set of the first 10 prime numbers
    val primeNumbers = setOf(2,3,5,7,11,13,17,19,23,29)
    println("Is 21 a prime number?: ${primeNumbers.contains(21)}")
    println("Is 13 a prime number?: ${primeNumbers.contains(13)}")

    // ---

    // Your favorite drinks are
    val myDrinks = hashSetOf("water", "coke", "beer", "orange juice")

    // Your partner's favorite drinks are
    val theirDrinks = hashSetOf("water", "orange juice", "pineapple juice", "milk")

    // If you want to buy a drink that you both can enjoy, what are the options you have?
    // Print out the result.
    println("Your and your partner's favorite drinks are: ${myDrinks.intersect(theirDrinks)}")
}
