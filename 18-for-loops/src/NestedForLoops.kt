fun main(args: Array<String>) {
    // Print a nxn matrix of (i,j)-pairs
    val n = 10
    for (i in 1..n) {
        for (j in 1..n) {
            if (i == j) {
                print("diagonal\t")
            } else {
                print("$i,$j \t\t")
            }
        }
        println()
    }
}
