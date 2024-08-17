fun main(args: Array<String>) {
    val count = hashMapOf<Int, String>(
        Pair(1, "one"),
        Pair(2, "two"),
        Pair(3, "three")
    )

    // You can get the number of key-value-entries in a map by accessing the .size field of a map
    println(count.size)     // 3

    // You can check whether there is a value stored for a given key inside the map, with the method .containsKey(...)
    println(count.containsKey(4))    // false
    println(count.containsKey(3))    // true

    // It is also possible to check if a value is present in a map
    println(count.containsValue("four"))    // false
    println(count.containsValue("three"))   // true

    // You can also check, if there are any key-value-entries present in the map
    println(count.isEmpty())          // false
    val emptyMap = hashMapOf<Int, String>()
    println(emptyMap.isEmpty())       // true


}
