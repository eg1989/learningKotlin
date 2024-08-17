fun main(args: Array<String>) {
    print("Enter a Greeting message: ")
    val message: String? = readlnOrNull()
    println(message ?: "Greetings my friend")

    print("Enter a number: ")
    val input = readLine()
    val number = input?.toInt()
    println("$number multiplied by 5 is ${number?.times(5)}")
}
