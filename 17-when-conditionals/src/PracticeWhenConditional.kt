fun main(args: Array<String>) {
//    print("Please enter your daily amount of meals: ")
//    val input = readLine() ?: "0"
//    val amountOfMeals = input.toInt()
//
//    when(amountOfMeals) {
//        in 0..2 -> println("You should increase your daily amount of meals to 3. $amountOfMeals is too few")
//        3 -> println("$amountOfMeals meals a day keeps the doctor away")
//        else -> println("$amountOfMeals meals per day is too much. You should decrease on your daily food intake to 3 meals a day")
//    }

    print("Please enter the current hour of the day (0-23): ")
    val input = readLine() ?: "0"
    val currentHour = input.toInt()

    when(currentHour) {
        in 6..11 -> println("morning")
        in 12..14 -> println("noon")
        in 15..17 -> println("afternoon")
        in 18..21 -> println("evening")
        in 22..23, in 0..5 -> println("night")
        else -> println("invalid input")
    }
}
