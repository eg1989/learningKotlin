fun main(args: Array<String>) {
    var test = "This will not work"
    println(test?.toInt())  // NumberFormatException
}
