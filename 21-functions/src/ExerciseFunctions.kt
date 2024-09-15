fun main(args: Array<String>) {
    for (i in 1..3) {
        printUserData()
    }
}

fun printUserData() {
    print("Please enter your name: ")
    val name = readLine() ?: ""
    print("Please enter your birth year: ")
    val input = readLine() ?: ""
    val birthYear = input.toInt()

    println("Your name is $name and you are probably ${2024 - birthYear} years old")
}
