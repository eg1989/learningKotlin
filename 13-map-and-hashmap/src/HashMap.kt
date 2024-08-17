fun main(args: Array<String>) {
    // HashMaps are the mutable version of Maps
    val count = hashMapOf<Int, String>(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(count)        // {1=one, 2=two, 3=three}

    // You can add your own key-value pairs to the map, with put(...)
    count.put(4, "four")
    println(count)        // {1=one, 2=two, 3=three, 4=four}

    // As an alternative, you can also use an index-based assignment
    count[5] = "five"
    println(count)        // {1=one, 2=two, 3=three, 4=four, 5=five}

    // With putAll, you can add all key-value pairs of another map
    val anotherMap = hashMapOf<Int, String>(Pair(43, "forty-three"), Pair(80, "eighty"), Pair(5, "fiveee"))
    count.putAll(anotherMap)
    println(count)        // {1=one, 2=two, 3=three, 4=four, 5=fiveee, 43=forty-three, 80=eighty}

    // You can remove an entry (key-value-pair) with the remove(...) method, required parameter is the key
    count.remove(80)
    println(count)        // {1=one, 2=two, 3=three, 4=four, 5=fiveee, 43=forty-three}

    // It is possible to set a new value for a specific key, with the replace(..., ...) method
    count.replace(43, "fooorty-theeeee")
    println(count)        // {1=one, 2=two, 3=three, 4=four, 5=fiveee, 43=fooorty-theeeee}
    count[43] = "forty-three"
    println(count)        // {1=one, 2=two, 3=three, 4=four, 5=fiveee, 43=forty-three}

    // You can delete all key-value-entries from a map with the .clear() function
    count.clear()
    println(count)        // {}

}
