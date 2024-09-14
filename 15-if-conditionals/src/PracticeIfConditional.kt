fun main(args: Array<String>) {
//    print("Please enter a number: ")
//    val input = readln().toInt() ?: 0
//    val digitMessage = if (input / 10 == 0) "Input $input has one digit" else "$input has more than one digit"
//    println(digitMessage)

    val response = 201

    val message = if (response in 100..199) "Information response"
    else if (response in 200..299) "Success"
    else if (response in 300..399) "Redirect"
    else if (response in 400..499) "Client error"
    else if (response in 500..599) "Server error"
    else "Unknown error"

    println(message)

}
