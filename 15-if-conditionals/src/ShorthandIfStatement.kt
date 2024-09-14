fun main(args: Array<String>) {
    print("Please enter a number: ")
    val input = readLine() ?: "0"
    val number = input.toInt()
    var isEven: String? = null

    // You can omit curly braces, if there is only one expression inside each block
    if (number % 2 == 0)
        isEven = "Number is even"
    else
        isEven = "Number is odd"

    println(isEven)
}
