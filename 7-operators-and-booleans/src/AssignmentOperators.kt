fun main(args: Array<String>) {

    // Assignment operator
    val dozen = 12
    var months = dozen
    println(months)     // 12

    // Reference
    val userName = "Lucy"
    val greeting = "Hello $userName"
    println(greeting)   // Hello Lucy

    // Reference expression
    val products = 3
    val price = 9.99
    println("Total price is ${products * price}") // Total price is 29.97
}
