fun main(args: Array<String>) {
    /*
    With Non-null assertions the developer can tell the compiler, that a nullable variable is not null in this case and
    therefore bypasses Null-safety checks
     */
    var catName: String? = null
    // println(catName!!.length) // NullPointerException, program crashes
    catName = "Chonkers"
    println(catName!!.length)    // 8

}
