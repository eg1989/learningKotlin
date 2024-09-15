fun main(args: Array<String>) {
    val evenNumbersList = listOf(2, 6, 4, 7, 9)
    for (number in evenNumbersList) {
        if (number % 2 != 0) {
            println("Odd number $number detected - Terminating loop...")
            break
        }
        println("Half of $number is ${number / 2}")
    }
}
