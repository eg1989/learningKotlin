fun main(args: Array<String>) {
    val usernames = hashSetOf("john", "bob", "alice")
    var usernameValid = false
    do {
        print("Choose your username - (Please do not use one of the following: $usernames): ")
        val input = readLine() ?: ""
        if (!usernames.contains(input)) {
            println("Your username $input is a valid username, it will be added")
            usernames.add(input)
            usernameValid = true
        } else {
            println("Your username $input already exists")
        }
    } while(!usernameValid)
    println("The following usernames are now added: $usernames")

}
