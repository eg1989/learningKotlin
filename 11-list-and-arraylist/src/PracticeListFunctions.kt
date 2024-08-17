fun main(args: Array<String>) {
    val winners = listOf("Usain", "John", "Michael", "Alex", "Bob")
    println("Michael finished on position ${winners.indexOf("Michael") + 1}")

    val availableColors = listOf("red", "blue")
    val requiredColors = listOf("red", "green", "blue")
    println("Printer can print: ${availableColors.containsAll(requiredColors)}")

    val recipe: ArrayList<String> = arrayListOf("Chicken", "Egg", "Mozzarella", "Pepper")
    recipe.set(recipe.indexOf("Mozzarella"), "Blue Cheese")
    println(recipe)
}
