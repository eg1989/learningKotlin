fun main(args: Array<String>) {
    val input: String? = readLine()
    try {
        val number: Int? = input?.toInt()
        println(number?.times(5))
    } catch(e: Exception) {
        e.printStackTrace()
        println("The value '$input' is not a number")
    }

    val runInput: String? = readLine()
    try {
        val kilometersRun: Double? = runInput?.toDouble()
        val kilometersRunInMiles: Double? = kilometersRun?.times(0.62)
        println("You have run $kilometersRun km, which is equivalent to $kilometersRunInMiles miles")
    } catch(e: Exception) {
        println("The value '$runInput' is not a number")
        e.printStackTrace()
    }

}
