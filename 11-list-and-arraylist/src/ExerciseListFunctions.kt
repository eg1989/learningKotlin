fun main(args: Array<String>) {
    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
    println("Original animals: $animals")

    // A new panda bear cub has arrived
    println("Panda bear cub has arrived")
    animals.add("panda")
    println("List of animals: $animals")

    // The lion has been sold to a different zoo
    println("The lion has been sold to a different zoo")
    animals.remove("lion")
    println("List of animals: $animals")

    // Does the zoo have both elephants and giraffes?
    println("Does the zoo have both elephants and giraffes?")
    println("Answer: ${animals.containsAll(listOf("elephant", "giraffe"))}")
}
