fun main(args: Array<String>) {
    val evenNumbersList = listOf(2, 6, 7, 4, 9, 10)
    for (number in evenNumbersList) {
        if (number % 2 != 0) {
            println("Odd number $number detected - Jumping to next value...")
            continue
        }
        println("Half of $number is ${number / 2}")
    }
}
