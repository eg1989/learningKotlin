fun main(args: Array<String>) {
    print("Please enter a number: ")
    val input = readLine()?:"0"
    println(input)
    println("input as byte: ${input.toByte()}, type of input: ${input.toByte()::class.java}")
    println("input as short: ${input.toShort()}, type of input: ${input.toShort()::class.java}")
    println("input as int: ${input.toInt()}, type of input: ${input.toInt()::class.java}")
    println("input as long: ${input.toLong()}, type of input: ${input.toLong()::class.java}")
    println("input as float: ${input.toFloat()}, type of input: ${input.toFloat()::class.java}")
    println("input as double: ${input.toDouble()}, type of input: ${input.toDouble()::class.java}")

    val pi = 3.14159
    val piAsInt = pi.toInt()
    println("piAsInt is $piAsInt") // Only use integer-part of pi
}
