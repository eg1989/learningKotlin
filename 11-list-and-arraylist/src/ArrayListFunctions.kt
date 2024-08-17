fun main(args: Array<String>) {

    // You can create a new mutable ArrayList with arrayListOf(...)
    val colors = arrayListOf("Red", "Green", "Blue", "Purple", "White")
    println(colors)

    // All List-functions are applicable on ArrayLists aswell, e.g.:
    println(colors.size)    // 5
    println(colors.indexOf("Purple"))   // 3
    println(colors.contains("Red"))     // true
    println(colors.contains("Gray"))    // false

    // You can replace an element at a specific position with another one, with set(..., ...)
    colors.set(1, "Orange")
    println(colors)         // ["Red", "Orange", "Blue", "Purple", "White"]

    // You can create a subList of elements, with subList(firstIndex, lastIndex)
    // firstIndex is included, lastIndex is excluded
    val subColors = colors.subList(1, colors.size - 1)
    println(subColors)      // ["Orange", "Blue", "Purple"]

    // You can remove all elements from an ArrayList with clear()
    subColors.clear()
    println(subColors)      // []

    // You can check if a list is empty with isEmpty()
    println(colors.isEmpty())   // false
    colors.clear()
    println(colors.isEmpty())   // true

    // And many more functions...
}
