fun main(args: Array<String>) {
    val productPrice: Double = 29.99
    println("A product costs $productPrice")
    print("How many products do you want to buy? ")
    val quantity: Int = readLine()?.toInt()?:3
    println("A product costs $productPrice and you want to buy $quantity which sums up to ${productPrice * quantity}")
}
