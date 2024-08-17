fun main(args: Array<String>) {
    val currentYear = 2024
    print("Please enter your year of birth: ")
    val yearOfBirth: Int = (readLine()?:"").toInt()
    val estimatedAge = currentYear - yearOfBirth

    println("Your year of birth is: $yearOfBirth and your estimated age is: $estimatedAge")
}
