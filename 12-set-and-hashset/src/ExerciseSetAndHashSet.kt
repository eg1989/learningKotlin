fun main(args: Array<String>) {
    // You have a list of customers for your online store
    val customers: HashSet<String> = hashSetOf("Carlos Black", "Jimmy Blue", "Sarah White")

    // A new customer has joined
    customers.add("Tyrone Greene")

    // A customer has chosen to leave
    customers.remove("Carlos Black")

    // Print the list of customers
    println(customers)  // ["Jimmy Blue", "Tyrone Greene", "Sarah White"]
}
