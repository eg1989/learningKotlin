fun main(args: Array<String>) {
    print("Please enter a double: ")
    val input: Double? = readlnOrNull()?.toDouble()
    val inputAsString: String? = input?.times(7)?.toString()
    println("length of $inputAsString is ${inputAsString?.length}")
}
