fun main() {
    val myText = "   Hello my  Friend !!  "

    // Länge des Strings ausgeben
    println(myText.trim())

    val myPet = "Crocodile"
    println(myPet.get(3))
    println(myPet[3])

    println(myPet.substring(3))
    println(myPet.substring(3,6))

    println(myPet.dropLast(3))
}
