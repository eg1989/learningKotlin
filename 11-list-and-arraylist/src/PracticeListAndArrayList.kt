fun main(args: Array<String>) {
    val favoriteAnimals: List<String> = listOf("Cat", "Wiener dog", "budgie")
    println("favoriteAnimals: $favoriteAnimals")
    println("Size of favoriteAnimals: ${favoriteAnimals.size}")
    println("Second element of favoriteAnimals: ${favoriteAnimals[1]}")

    val customers: ArrayList<String> = arrayListOf("Carlos Blanca", "Joe Rogan", "Peter Griffin")
    println(customers)
    // Add new customer
    customers.add("John Maynard Keynes")
    println(customers)
    // Remove customer
    customers.remove("Carlos Blanca")
    println(customers)
}
