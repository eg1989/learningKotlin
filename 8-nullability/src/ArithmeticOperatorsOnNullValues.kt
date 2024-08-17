fun main(args: Array<String>) {
    val a = 5
    val b = 7
    println("$a + $b = ${a + b}")

//    val c: Int? = a
//    println("$c + $d = ${c + 5}") // Compilerfehler

    val aNullable: Int? = a
    println("$aNullable + 6 = ${aNullable?.plus(6)}")   // 11
    println("$aNullable - 1 = ${aNullable?.minus(1)}")  // 4
    println("$aNullable * 5 = ${aNullable?.times(5)}")  // 25
    println("$aNullable / 3 = ${aNullable?.div(3)}")    // 1
    println("$aNullable % 3 = ${aNullable?.rem(3)}")    // 2
}
