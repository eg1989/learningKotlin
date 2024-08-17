fun main(args: Array<String>) {
    /*
    A finally-Block will be executed in any case, if an exception is thrown or not
     */
    val test = readLine()
    try {
        println(test?.toInt())
    } catch(e: Exception) {
        e.printStackTrace()
        println("An exception occured: ${e.localizedMessage}")
    } finally {
        println("Application has terminated")
    }
}
