fun main(args: Array<String>) {
    print("Please enter an animal of which you want to know the lifespan: ")
    val animal = readLine() ?: "cats"
    println("The lifespan of a $animal is ${getLifespan(animal)} years")
}

fun getLifespan(animal: String): Int {
    return when (animal) {
        "cat" -> 15
        "dog" -> 10
        "rabbit" -> 12
        else -> 20
    }
}
