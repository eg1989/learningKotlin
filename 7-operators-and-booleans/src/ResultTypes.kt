fun main(args: Array<String>) {
    val a: Short = 52
    val b: Float = 3.2f
    val result = a * b
    println("type of result: ${result::class.java}, result: $result") // type of result: float, result: 166.4001

    val c: Short = 5
    val d: Int = 789
    val result2 = c + d
    println("type of result2: ${result2::class.java}, result2: $result2") // type of result: int, result: 794

    val e: Long = 8374622
    val f: Double = 12.44
    val result3 = e / f
    println("type of result3: ${result3::class.java}, result2: $result3") // type of result: double
}
