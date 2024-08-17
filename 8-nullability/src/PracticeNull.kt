fun main(args: Array<String>) {
    val username: String? = "Harrison"
    println(username?.substring(3, 6))

    val myDouble: Double? = 5.3
    println(myDouble?.times(6)?.toFloat())

    print("Please enter your name: ")
    val myName: String? = readlnOrNull()
    println(myName?.length ?: 0)
}
