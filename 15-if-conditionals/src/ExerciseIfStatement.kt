fun main(args: Array<String>) {
    val hasEggs = true
    val hasBacon = true
    var totalAmountSpent : Int = 0

    if (hasEggs) {
        println("Buy 12 eggs")
        totalAmountSpent += 12 * 5
        if (hasBacon) {
            println("Buy 2 packs of bacon")
            totalAmountSpent += 2 * 20
        }
    } else {
        println("No eggs available")
    }
    println("Total amount spent: $totalAmountSpent")
}
