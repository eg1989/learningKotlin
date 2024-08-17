fun main(args: Array<String>) {
    // You manage an amusement park, and you have a map that stores dates and attendance
    val attendance = hashMapOf(
        Pair("23 Sept", 2837),
        Pair("24 Sept", 3726),
        Pair("25 Sept", 6253),
    )

    // Add a value for 26 Sept.
    attendance["26 Sept"] = 5387

    // How many people attended in total on 25 and 26 Sept?
    println("On 25 and 26 Sept, ${(attendance["25 Sept"]?:0) + (attendance["26 Sept"]?:0)} attended the amusement park in total")

    // Is data for 22 Sept available?
    println("Is data for 22 Sept available?: ${attendance.containsKey("22 Sept")}")
}
