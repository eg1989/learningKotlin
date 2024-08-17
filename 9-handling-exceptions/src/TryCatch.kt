fun main(args:Array<String>){
    val test = readLine()
    try {
        println(test?.toInt())
    } catch(e: Exception){
        e.printStackTrace()
        println("Eine Exception wurde geworfen ${e.localizedMessage}")
    }

    // General structure
    try {
        // Try to do something
    } catch(e: Exception){
        // if an exception occurs, do this
    } finally {
        // always execute this part
    }
}
