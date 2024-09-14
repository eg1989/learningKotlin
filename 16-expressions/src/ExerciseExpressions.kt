fun main(args: Array<String>) {
    print("Please enter your age: ")
    val input = readLine() ?: "1"
    var age = input.toInt()
    if (age == 0) age++

    val message = if (age in 1..12) {
        "You are a child"
    } else if ( age in 13..17) {
        "You are a teen"
    } else if (age > 17) {
        "You are an adult"
    } else {
        "Invalid input"
    }
    println(message)
}
