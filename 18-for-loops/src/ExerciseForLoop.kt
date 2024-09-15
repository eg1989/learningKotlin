fun main(args: Array<String>) {
    print("Please enter a year: ")
    val input = readLine() ?: "2024"
    val year = input.toInt()

    println("Printing month-data for year: $year...")
    val leapYear = year % 4 == 0

    for (i in 1..12) {
        when (i) {
            1 -> println("January has 31 days")
            2 -> println("February has ${if (leapYear) 29 else 28} days")
            3 -> println("March has 31 days")
            4 -> println("April has 30 days")
            5 -> println("May has 31 days")
            6 -> println("June has 30 days")
            7 -> println("July has 31 days")
            8 -> println("August has 31 days")
            9 -> println("September has 30 days")
            10 -> println("October has 31 days")
            11 -> println("November has 30 days")
            else -> println("December has 31 days")
        }
    }
}
