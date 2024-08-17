fun main(args: Array<String>) {
    print("Input something: ")
    val userInput = readLine()?:""
    println("Double is ${userInput.toInt() * 2}")

    val myNumAsString = "6"
    val myNum: Int = myNumAsString.toInt()
    println(myNum)
}
