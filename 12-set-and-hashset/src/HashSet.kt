fun main(args: Array<String>) {
    // A HashSet has all the properties of a Set (no duplicates, no internal order), but it is mutable
    // which means you may add and remove elements
    val numbers = hashSetOf(5, 2, null, 34, 290, 2, null)
    println(numbers)    // [null, 2, 34, 290, 5]

    // You can add elements with the .add(...) method
    numbers.add(93)
    println(numbers)    // [null, 2, 34, 290, 5, 93]

    // You can add whole collections with the .addAll(...) method
    numbers.addAll(setOf<Int?>(1, 2, 4, 290, null))
    println(numbers)    // [null, 1, 2, 34, 290, 4, 5, 93]

    // And of course you are able to remove elements, with remove(...)
    numbers.remove(290)
    println(numbers)    // [null, 1, 2, 34, 4, 5, 93]

    // removeAll(...) for Collections
    val toRemove = setOf(34, 4)
    numbers.removeAll(toRemove)
    println(numbers)    // [1, 2, 5, 93]
}
