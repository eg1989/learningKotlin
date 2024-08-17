fun main(args: Array<String>) {
    print("Please enter a number: ")
    val inputNumber = (readLine()?:"").toInt()
    val doubleFactor = 2.5
    println("Multiply inputNumber $inputNumber by doubleFactor $doubleFactor...")
    val result = inputNumber * doubleFactor
    println("Value of result is $result, Type of result is ${result::class.java}")
}
