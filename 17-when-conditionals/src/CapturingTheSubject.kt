fun main(args: Array<String>) {
    val name = "Michelle"
    when(val length = name.length) {
        in 1..5 -> println("Not very long $length")
        in 8..17 -> println("That is a very long name for a $length")
        else -> println("I am not decisive on the $length")
    }
}
