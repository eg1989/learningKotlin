fun main(args: Array<String>) {
    val a = 4
    val b = 5
    val c = 3

    // >
    println("$a > $b will return ${a > b}")  // false
    println("$a > $c will return ${a > c}")  // true
    println("$a > $a will return ${a > a}")  // false

    println()

    // >=
    println("$a >= $b will return ${a >= b}")  // false
    println("$a >= $c will return ${a >= c}")  // true
    println("$a >= $a will return ${a >= a}")  // true

    println()

    // <
    println("$a < $b will return ${a < b}")  // true
    println("$a < $c will return ${a < c}")  // false
    println("$a < $a will return ${a < a}")  // false

    println()

    // <=
    println("$a <= $b will return ${a <= b}")  // true
    println("$a <= $c will return ${a <= c}")  // false
    println("$a <= $a will return ${a <= a}")  // true

    println()

    // ==
    println("$a == $b will return ${a == b}")  // false
    println("$a == $c will return ${a == c}")  // false
    println("$a == $a will return ${a == a}")  // true

    println()

    // !=
    println("$a != $b will return ${a != b}")  // true
    println("$a != $c will return ${a != c}")  // true
    println("$a != $a will return ${a != a}")  // false

    println()

    val result = a != b
    println(result) // true
}
