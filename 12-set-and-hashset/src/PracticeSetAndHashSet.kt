fun main(args: Array<String>) {
    // Empty set of String colors
    val colors: HashSet<String> = hashSetOf()

    // Add three colors
    colors.addAll(listOf("Red", "Green", "Blue"))

    // Remove one
    colors.remove("Green")

    // Print out the result
    println(colors)             // ["Red", "Blue"]

    // ---

    // Create a set of the objects that are on your desk at the moment
    val objectsOnDesk: HashSet<String> = hashSetOf("pen", "book", "tissues", "controller", "mouse", "keyboard")

    // Create another set of the objects that you would remove if you were to clean your desk
    val objectsToRemove: Set<String> = setOf("pen", "book", "tissues")

    // Print out the items that would remain
    objectsOnDesk.removeAll(objectsToRemove)
    println(objectsOnDesk)      // [mouse, keyboard, controller]
}
