fun main(args: Array<String>) {
    /*
    The Elvis operator is being used to return a default value, in case a variable or method call returns null
     */
    var catName: String? = "Chonkers"
    println(catName ?: "This cat has no name")  // Chonkers
    catName = null
    println(catName ?: "This cat has no name")  // This cat has no name

    /*
    After application of an Elvis operator, there is no need for a null safe call, since the default value will be used
     */
    println(catName?:"Fluffy".length)
}
