fun main(args: Array<String>) {
    val cats = 3
    println("type of cats: ${cats::class.java}")
    val catsString = cats.toString()
    println("type of catsString: ${catsString::class.java}")

    val pi = 3.14159
    println("type of pi: ${pi::class.java}")
    val piString = cats.toString()
    println("type of piString: ${piString::class.java}")
}
