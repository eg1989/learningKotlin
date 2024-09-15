fun main(args: Array<String>) {
    do {
        print("Welcome to the night club, please enter your age: ")
        val input = readLine() ?: ""
        if (input == "stop") continue
        val userAge = input.toInt()
        if (userAge < 18)
            println("You are $userAge years old and too young to enter the club")
        else
            println("Have a nice time!")
    } while (input != "stop")
}
