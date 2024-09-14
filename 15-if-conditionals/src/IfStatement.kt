fun main(args: Array<String>) {
    print("Is it night? ")
    val input = readLine()?:"true"
    val night = input.toBoolean()

    if (night) {
        println("Go asleep!")
    } else {
        println("Be active!")
    }

    // ---

    print("Please enter the amount of funds you have: ")
    val input2 = readLine()?:"0"
    var clientFunds = input2.toInt()
    val price = 50
    var clientProducts = 0

    if (clientFunds > price) {
        clientFunds -= price
        clientProducts++
        println("You have purchased $clientProducts products for a total of $price and you have $clientFunds left.")
    } else {
        println("You have insufficient funds ($clientFunds) to buy a product ($price)")
    }
}
