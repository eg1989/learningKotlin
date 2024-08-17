fun main(args: Array<String>) {
    // All Set-functions are also applicable to HashSets

    // There are also some other functions specifically for HashSets

    // With .intersect(...), you can create a result set which consists of elements which belong to both,
    // the parameter Set and the Set you called the method on
    val numbers = setOf<Int?>(1, 2, 3, null, 5)
    val numbersToIntersect = setOf<Int?>(3, 5, null, 69, 38)
    val intersection = numbers.intersect(numbersToIntersect)
    println(intersection)   // [3, null, 5]

    // You can also remove all Elements from a HashSet with .clear()
    val numbers2 = hashSetOf(1, 2, 3, 4, 5)
    numbers2.clear()
    println(numbers2)       // []
}
