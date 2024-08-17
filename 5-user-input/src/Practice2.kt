fun main(args: Array<String>) {
    print("Please enter a number: ")
    val inputNumber = readLine()?:""
    val result = inputNumber.toInt() * 5
    println("$inputNumber * 5 is $result")
}
