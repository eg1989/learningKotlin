fun main(args: Array<String>) {
    // Create a new Set with setOf(...)
    val numbers = setOf<Int?>(3, 4, 5, null, 8)
    println(numbers)        // [3, 4, 5, null, 8]

    // Get the amount of elements in a set with the attribute .size
    println(numbers.size)   // 5

    // You may check with .contains(...), if an element is part of the Set
    println(numbers.contains(4))    // true
    println(numbers.contains(89))    // false

    // .containsAll(...) for Collections as parameter
    println(numbers.containsAll(setOf(13, null, 8))) // false
    println(numbers.containsAll(setOf(null, 4, 5)))  // true

    // You can check, whether a Set is empty or not
    println(numbers.isEmpty())  // false
    println(setOf<String>().isEmpty())  // true
}
