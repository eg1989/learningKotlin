fun main(args: Array<String>) {
    /*
    You can throw your own exceptions with the keyword throw, if your application reaches an unredeamable state
     */
    var test = readLine()
    throw IllegalStateException("I don't like this input")
}
