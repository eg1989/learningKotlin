fun main(args: Array<String>) {
//    val guestList = setOf("Paul", "Peter", "Frank")
//
//    print("Please enter your name: ")
//    val guest = readLine() ?: ""
//
//    if (guest in guestList) {
//        println("Hi $guest, please come in")
//    } else {
//        println("Sorry $guest, only invited guests allowed")
//    }


//    print("How many cats do you have?: ")
//    val input = readLine() ?: "0"
//    val cats = input.toInt()
//
//    val howMany = if (cats in 1..3) {
//        "few cats"
//    } else if (cats in 4..6) {
//        "several cats"
//    } else if (cats > 7) {
//        "many cats"
//    } else {
//        "invalid input"
//    }
//    println(howMany)

    
    val availableAnimals = arrayListOf("cat", "dog", "horse")
    availableAnimals.clear()
    if (availableAnimals.isNotEmpty()) {
        println("The following animals are still avaiable: $availableAnimals")
    } else {
        println("Thank you for adopting all animals")
    }
}
