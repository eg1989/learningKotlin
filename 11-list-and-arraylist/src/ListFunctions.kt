fun main(args: Array<String>) {
    /*
    create a new list colors
     */
    val colors = listOf("Red", "Green", "Blue")

    /*
    returns size of colors
     */
    println(colors.size)                    // 3

    /*
    Checks if a list contains a specific element
     */
    println(colors.contains("Red"))         // true
    println(colors.contains("Yellow"))      // false

    /*
    Checks if a list contains all elements of a specific collection
     */
    val otherColors = listOf("White", "Blue")
    println(colors.containsAll(otherColors))    // false
    val containingColors = listOf("Green", "Blue")
    println(colors.containsAll(containingColors))    // true

    /*
    Returns the first index of an element
     */
    println(colors.indexOf("Green"))        // 1

    /*
    Returns the last index of an element
     */
    val colorsDuplicates = listOf("Red", "Green", "Blue", "Green", "Red")
    println(colorsDuplicates.lastIndexOf("Green"))        // 3
    println(colorsDuplicates.lastIndexOf("Red"))        // 4
}
