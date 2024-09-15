fun main(args: Array<String>) {
    for (i in 1..10) {
        printHello()
    }
    for (i in 1..3) {
        inputMultiplier()
    }
}

fun printHello() {
    println("Hello")
}

fun inputMultiplier() {
    print("Please enter a number: ")
    val input = readLine() ?: "0"
    val number = input.toInt()
    val result = number * 17
    println("Your input was $number, multiplying it by 17 you will receive $result")
}
