fun main(args: Array<String>) {
    val animal = "cat"
    val action = when (animal) {
        "cat" -> "pet it"
        "dog" -> {
            println("Yey I met a dog :D")
            "feed it"
        }
        else -> "google it"
    }
    println("When you meet a $animal you should $action")

    val month = "February"
    val days = when(month) {
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }
    println("The month $month has $days days")
}
