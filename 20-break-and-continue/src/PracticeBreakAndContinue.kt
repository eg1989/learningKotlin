fun main(args: Array<String>) {
//    val animalShelter = hashSetOf<String>()
//    for (i in 1..5) {
//        print("Please enter an animal, you want to bring to the shelter: ")
//        val animal = readLine() ?: ""
//        if (animal == "snake") {
//            println("You are not allowed to bring snakes to the shelter!")
//            break
//        }
//        animalShelter.add(animal)
//        println("Current animals: $animalShelter")
//    }
//    println("Animals in the shelter: $animalShelter")

    val clients = listOf("Anna", "Bob", "Carol", "David")
    for (client in clients) {
        if (client[0] == 'C') continue
        println("Greetings $client, how can I help you?")
    }
}
