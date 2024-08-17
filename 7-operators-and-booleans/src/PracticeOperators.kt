fun main(args: Array<String>) {
    // First exercise
    var a = 76.254
    var b = 3.867

    println("Addition: ${a + b}")

    println("Subtraction: ${a - b}")

    println("Multiplication: ${a * b}")

    println("Division: ${a / b}")

    println("Modulo: ${a % b}")

    // Second exercise
    val kiloPrice = 29.99
    val purchaseAmount = 1F/3
    println("In order to get $purchaseAmount of meat for the price of $kiloPrice the person has to spend ${kiloPrice * purchaseAmount}")

    // Third exercise
    print("Congratulations! You have won a contest, which triples the amount of money inside your bank account. Please enter the amount you have stored there: ")
    val bankAccount = readLine()?.toDoubleOrNull()?:0.0
    println("Your new amount on your bank account is: ${bankAccount * 3}")
}
