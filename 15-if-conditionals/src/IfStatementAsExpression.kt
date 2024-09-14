fun main(args: Array<String>) {
    print("Please enter a number: ")
    val input = readLine() ?: "0"
    val number = input.toInt()
    var isEven: String? = null

    // if-else-statements can also be used as expressions, which then can be assigned to a variable
    isEven = if (number % 2 == 0) "Number is even" else "Number is odd"

    println(isEven)

    // Multi-line is possible too
    val isBiggerThanTen = if (number > 10) {
        println("Processing...")
        "Number is bigger than 10"
    } else {
        println("Processing...")
        "Number is smaller than 10"
    }

    println(isBiggerThanTen)
}
