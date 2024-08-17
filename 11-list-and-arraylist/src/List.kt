fun main(args: Array<String>) {
    /*
    A list is an ordered collection of elements which allows duplicates to be present
     */
    val colors: List<String> = listOf("Red", "Green", "Blue")
    println(colors)

    /*
    If you want to create an empty list, you have to provide the type of this list
     */
    val emptyColors: List<String> = listOf()
    val emptyColors2 = listOf<String>()
    println(emptyColors)
    println(emptyColors2)

    /*
    A list can contain duplicate elements
     */
    val colorsWithDuplicates = listOf("Red", "Green", "Blue", "Green", "White", "Yellow", "Green", "Blue")
    println(colorsWithDuplicates)

    /*
    A list can also contain null-Elements
     */
    val colorsWithNull = listOf(null, "red", "white", "green", null)
    println(colorsWithNull)

    /*
    Lists are immutable, but you are able to retrieve elements
     */
    val retrievableColors = listOf("Red", "Green", "Blue")
    println(retrievableColors[0])       // Red
    println(retrievableColors[1])       // Green
    // println(retrievableColors[5])     // ArrayIndexOutOfBoundsException

    /*
    It is also possible to access List-elements with a .get(index: Int) method, e.g. when your list is nullable
     */
    val nullableList: List<String>? = listOf("red", "green", "blue")
    // println(nullableList[1])         // Compiler error
    println(nullableList?.get(1))       // Green

    /*
    You can access the size of the list via the .size attribute
     */
    println(nullableList?.size)

    println("Program finished")


}
