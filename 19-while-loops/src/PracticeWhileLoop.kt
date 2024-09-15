fun main(args: Array<String>) {
    val greeting = "Hello my friend, how are you?"
    var i = 0
    while (i < 10) {
        i++
        println("#$i $greeting")
    }

    i = 0
    val cats = listOf("Tigger", "Smokey", "Sassy", "Patch", "Sammy")
    while (i < cats.size) {
        println("Hello ${cats[i]}")
        i++
    }

    print("Please enter an integer: ")
    val input = readLine() ?: "1"
    var number = input.toInt()
    var currFactor = 1
    var result: Long = 1
    while (currFactor <= number) {
        result *= currFactor++
    }
    println("$number! = $result")
}
