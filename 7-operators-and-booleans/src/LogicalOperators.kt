fun main(args: Array<String>) {

    val isDay = true
    val isEvening = true

    // And-Operator
    println("AND")
    println(true && true)   // true
    println(true && false)   // false
    println(false && false)   // false
    println(isDay && isEvening)     // true

    println()

    // Or-Operator
    println("OR")
    println(true || true)   // true
    println(true || false)   // true
    println(false || false)   // false
    println(isDay && isEvening)     // true

    println()

    println("NOT")
    println(!true)  // false
    println(!false) // true
    println(!isDay) // false
}
