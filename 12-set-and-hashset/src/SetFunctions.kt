fun main(args: Array<String>) {
    // Create a new Set with setOf(...)
    val numbers = setOf<Int?>(3, 4, 5, null, 8)
    println(numbers)        // [3, 4, 5, null, 8]

    // Get the amount of elements in a set with the attribute .size
    println(numbers.size)   // 5

    // You may check with .contains(...), if an element is part of the Set
    numbers.contains(4)     // true
    numbers.contains(89)    // false
}
