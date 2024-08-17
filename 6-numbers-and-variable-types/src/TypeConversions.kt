fun main(args: Array<String>) {
    val intNumber = 5
    val longNumber: Long = intNumber.toLong()
    val longNumber2: Long = 5

    // Conversion Int -> Long
    val cats = 3
    val longCats = cats.toLong()
    println("Type of longCats: ${longCats::class.java}")

    // Conversion from bigger type to smaller type resulting in corrupted data
    val people: Long = 7_500_000_000
    val fewPeople: Int = people.toInt()
    println("Expected value of fewPeople $people but actual $fewPeople")
    println("Type of people: ${people::class.java}")
    println("Type of fewPeople: ${fewPeople::class.java}")

    val dogs = 5
    val byteDogs = dogs.toByte()
    val shortDogs = dogs.toShort()
    val intDogs = dogs.toInt()
    val longDogs = dogs.toLong()
    val floatDogs = dogs.toFloat()
    val doubleDogs = dogs.toDouble()

    println("Type of byteDogs: ${byteDogs::class.java} Value of byteDogs: $byteDogs")
    println("Type of shortDogs: ${shortDogs::class.java} Value of shortDogs: $shortDogs")
    println("Type of intDogs: ${intDogs::class.java} Value of intDogs $intDogs")
    println("Type of longDogs: ${longDogs::class.java} Value of longDogs:$longDogs")
    println("Type of floatDogs: ${floatDogs::class.java} Value of floatDogs: $floatDogs")
    println("Type of doubleDogs: ${doubleDogs::class.java} Value of doubleDogs: $doubleDogs")
}
