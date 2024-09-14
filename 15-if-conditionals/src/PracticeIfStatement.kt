fun main(args: Array<String>) {
//    print("You are about to go on a journey in your car. Do you want to pick up the car keys? (yes/no) ")
//    val input = readLine() ?: "false"
//    var driverHasKeys = false
//    if (input == "yes") {
//        driverHasKeys = true
//    }
//    if (driverHasKeys) {
//        println("Startup the car")
//    } else {
//        println("Unable to start the car without keys")
//    }

    print("Please enter the hour of the current time (0-23): ")
    val input = readLine() ?: ""
    val currentHour = input.toInt()

    if (currentHour < 12) {
        println("$currentHour AM")
    } else if (currentHour < 24) {
        println("${currentHour - 12} PM")
    } else {
        println("Invalid input")
    }
}
