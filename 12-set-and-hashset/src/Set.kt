fun main(args: Array<String>) {

    // A set is an unordered collection of unique elements
    // This means:
    // 1. The output of a set will not necessarily be in the samer order as the input
    // 2. Duplicates will be ignored
    val numbers = setOf<Int>(6, 37, 6, 42)
    println(numbers)    // [6, 37, 42]

    // In order to create an empty Set, you have to specify the type of the Set
    // You can do it in two ways
    val emptyNumbers = setOf<Int>()
    val emptyNumbers2 : Set<Int> = setOf()
    println(emptyNumbers)   // []
    println(emptyNumbers2)  // []

    // A set can also contain a null Element, but only one, since duplicates are prohibited
    val setWithNull = setOf(null, null, 25, null)
    val explicitlyTypedSetWithNull: Set<Int?> = setOf(73, null, null, 9)
    println(setWithNull)
    println(explicitlyTypedSetWithNull)

}
