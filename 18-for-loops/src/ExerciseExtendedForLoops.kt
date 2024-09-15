fun main(args: Array<String>) {
    print("Please enter a number: ")
    val input = readLine() ?: "5"
    val size = input.toInt()

    for (i in 1..size) {
        for (j in 1..size) {
            when ((i * j) % 3) {
                0 -> print("\uD83D\uDE00 ")
                1 -> print("\uD83E\uDD28 ")
                2 -> print("\uD83D\uDE31 ")
            }
        }
        println()
    }
}
