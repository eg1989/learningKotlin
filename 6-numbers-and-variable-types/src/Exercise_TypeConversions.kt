fun main() {
    val pi = 3.14159

    print("Enter a number of type double: ")
    val input = readLine()?.toDoubleOrNull()?:0.0
    val result = input * pi
    println("Your input was $input. Multiplying it by $pi is equal to $result")
}
