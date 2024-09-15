fun main(args: Array<String>) {
//    var number = 0
//    do {
//        print("Please enter a sufficient high number (>= 100): ")
//        val input = readLine() ?: "0"
//        number = input.toInt()
//    } while (number < 100)
//    println("You made it, $number is bigger or equal to 100")

    var finished = false
    do {
        print("Please enter a number, whose factorial is bigger than 3,000,000: ")
        val input = readLine() ?: "0"
        val number = input.toInt()
        var factorial: Long = 1
        var factor = 1
        while (factor <= number) {
            factorial *= factor++
        }
        if (factorial < 3_000_000L) println("Sorry, factorial of $number is $factorial and smaller than 3,000,000, please try again!")
        else {
            println("Hooray, factorial of $number is $factorial and therefore bigger or equal to 3,000,000")
            finished = true
        }

    } while (!finished)
}
