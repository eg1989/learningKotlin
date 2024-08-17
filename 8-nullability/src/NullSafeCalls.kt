fun main(args: Array<String>) {
    /*
     Null Safe Calls in Kotlin
     */
    var catName: String? = "Chonkers"
    println(catName?.length)    // 8, Wert wird ganz normal ausgegeben, da catName nicht null ist

    catName = null
    println(catName?.length)    // null, weil catName ebenfalls null ist

    /*
    Chaining of Null Safe Call
     */
    var dogName: String? = "Fluffy"
    println(dogName?.length?.toString())    // 6
    dogName = null
    println(dogName?.length?.toString())    // null

}
