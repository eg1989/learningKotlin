fun main(args: Array<String>) {
    print("Please enter your name: ")
    val username = readLine() ?: "Boris"

    val firstLetter = username[0]

    val greeting = when (val firstLetterCaseInsensitive = firstLetter.lowercaseChar()) {
        'a', 'b', 'c' -> "Hello $username, your name starts with one of the first three letters of the alphabet"
        'd', 'e', 'f' -> "Welcome $username, your name starts either with d, e or f"
        else -> "Greetings $username, how can I help you today?"
    }
    println(greeting)
}
