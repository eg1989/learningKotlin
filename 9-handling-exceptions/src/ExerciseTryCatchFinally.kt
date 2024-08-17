fun main(args: Array<String>) {
    print("What product do you want to buy? ")
    val inputProduct: String? = readLine()
    print("How many products do you want to buy? ")
    val inputAmount: String? = readLine()
    val price: Double = 9.99
    try {
        val inputAmount = inputAmount?.toInt()
        println("You want to buy $inputAmount of $inputProduct which is a total of ${inputAmount?.times(price)}")
    } catch(e: Exception) {
        println("Unable to convert $inputAmount to a number")
        e.printStackTrace()
    }
}
