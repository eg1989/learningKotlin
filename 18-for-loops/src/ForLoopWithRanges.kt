fun main(args: Array<String>) {

    // Range with ascending order
    for (i in 1..3) {
        println("Strike #$i")
    }
    println("You're out!")

    // Range with descending order, "downTo"
    for (i in 10 downTo 0) {
        println(i)
        when(i) {
            9 -> println("Start your engines")
            6 -> println("On your marks")
            3 -> println("Get set")
            0 -> println("GO!")
        }
    }

    // Range with descending order using "downTo" and custom stepWidth using "step"
    for (i in 10 downTo 0 step 3) {
        println(i)  // 10 7 4 1
    }
}
