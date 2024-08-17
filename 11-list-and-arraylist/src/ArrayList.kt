fun main(args: Array<String>) {
    /*
    An ArrayList is (contrary to a List) a mutable Collection,
    which means it is possible to add and remove elements from it
     */
    val colors: ArrayList<String> = arrayListOf("Red", "Green", "Blue")
    println(colors)         // [Red, Green, Blue]

    /*
    Now we add an element
     */
    colors.add("Yellow")
    println(colors)         // [Red, Green, Blue, Yellow]

    /*
    Now we add the elements of another collection with addAll
     */
    val colorsToAdd: ArrayList<String> = arrayListOf("Pink", "Teal")
    colors.addAll(colorsToAdd)
    println(colors)         // [Red, Green, Blue, Yellow, Pink, Teal]

    /*
    You can also remove an element with remove
     */
    colors.remove("Red")
    println(colors)         // [Green, Blue, Yellow, Pink, Teal]

    /*
    And of course removeAll to remove all elements which are contained in a given collection
     */
    colors.removeAll(colorsToAdd)
    println(colors)         // [Green, Blue, Yellow]

    /*
    Elements can also be removed by its index, with the method removeAt
     */
    colors.removeAt(1)
    println(colors)         // [Green, Yellow]
}
