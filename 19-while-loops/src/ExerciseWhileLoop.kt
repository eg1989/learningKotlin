fun main(args: Array<String>) {
    print("Please enter a large integer: ")
    val input = readLine() ?: "100"
    val number = input.toInt()

    var i = 0
    while (i < number) {
        if (i % 7 == 0) println("$i is divisible by 7")
        i++
    }
}
