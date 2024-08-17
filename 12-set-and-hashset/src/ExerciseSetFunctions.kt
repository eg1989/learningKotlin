fun main(args: Array<String>) {
    // Your company has very strict dress code. Only certain color clothes can be worn in the office
    val acceptedColors = hashSetOf("white", "black", "grey")

    // You have certain colors in your wardrope
    val myColors = hashSetOf("blue", "red", "black", "green")

    // What colors can you wear?
    println("I am able to wear the following colors: ${myColors.intersect(acceptedColors)}")

    // Your company has added another color, "red" to their list.
    acceptedColors.add("red")

    // What options do you have now?
    println("Now I am able to wear the following colors: ${myColors.intersect(acceptedColors)}")

}
