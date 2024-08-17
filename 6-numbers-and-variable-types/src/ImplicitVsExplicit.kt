fun main(args: Array<String>) {
    val cats = 3
    println("Type of cats: ${cats::class.java}") // int

    val price = 14.99
    println("Type of price: ${price::class.java}") // double

    val dogs: Byte = 5
    println("Type of dogs: ${dogs::class.java}") // byte

    val days: Short = 20000
    println("Type of days: ${days::class.java}") // short

    val meals: Int = 3
    println("Type of meals: ${meals::class.java}") // int

    val life: Long = 42
    println("Type of life: ${life::class.java}") // long

    val newLife = 42L
    println("Type of newLife: ${newLife::class.java}") // long

    val priceImplicit = 35.99F
    println("Type of priceImplicit: ${priceImplicit::class.java}") // float

    val priceExplicit: Float = 39.99F
    println("Type of priceExplicit: ${priceExplicit::class.java}") // float
}
