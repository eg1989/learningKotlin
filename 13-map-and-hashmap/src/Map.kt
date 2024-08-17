fun main(args: Array<String>) {

    // A map is a set of key-value pairs, where each key is assigned to exactly one value
    // Each key has to be unique, the values are allowed to be duplicates
    val count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(count)  // {1="one", 2="two", 3="three"}

    // You need to provide a key- and value-type if you want to declare an empty Map
    val count2 = mapOf<Int, String>()
    println(count2) // {}
    val count3: Map<Int, String>  = mapOf()
    println(count3) // {}

    // With a map, you can access values with the corresponding key, via the .get(...) function
    println(count.get(2)) // two
    // You can also access it via the index-operator
    println(count[3])   // three

    // with .keys you can obtain a set (since they are all unique) of keys of the map
    println(count.keys) // [1, 2, 3]

    // with .values you can obtain a Collection (since duplicates are allowed) of values of the map
    println(count.values) // ["one", "two", "three"]
}
