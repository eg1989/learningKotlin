fun main(args: Array<String>) {
    print("Please enter the amount of money you have in your bank account: ")
    val amountInBankAccount = readLine()?.toDoubleOrNull()?:0.0
    print("How many years would you like to invest?: ")
    val amountOfYears = readLine()?.toIntOrNull()?:0
    print("What interest rate are you considering?: ")
    val inputRate = readLine()?.toDoubleOrNull()?:1.0
    val interestRate = inputRate + 1.0
    println("After $amountOfYears years, considering an interest rate of $interestRate your $amountInBankAccount " +
            "will grow to ${amountInBankAccount * Math.pow(interestRate, amountOfYears.toDouble())}")
}
