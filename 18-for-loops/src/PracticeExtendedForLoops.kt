fun main(args: Array<String>) {
//    print("Please enter a maxNumber: ")
//    val input = readLine() ?: "10"
//    val maxNumber = input.toInt()
//
//    for (i in maxNumber downTo 0) {
//        if (i % 7 == 0) {
//            println("$i is divisible by 7")
//        }
//    }

    // Build a triangle of 7s
    val length = 10
    for (i in 1..length) {
        for (j in 1..i) {
            print("\uD83D\uDE00 ")
        }
        println()
    }
}
