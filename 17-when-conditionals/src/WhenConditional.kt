fun main(args: Array<String>) {
    val animal = "cow"

    when (animal) {
        "dog" -> {
            println("woof woof")
        }
        "cat" -> {
            println("meow")
        }
        "cow" -> {
            println("mooh")
        }
        else -> {
            println("google it")
        }
    }

    var result = ""
    val number = 2344
    when (number % 2) {
        0 -> result = "even"
        1 -> result = "odd"
    }
    println("The number $number is $result")
}
