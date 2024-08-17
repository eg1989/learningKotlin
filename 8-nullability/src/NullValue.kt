fun main(args: Array<String>) {

    // Rule 1: If you want to use a variable, you have to assign a value to it prior
    val herName: String = "Lilly"
    val hisName: String? = null

    val amIAllowed: String
    val amIAllowed2: String?

    println()

    // Rule 2: You can only assign null to a variable, if you explicitly declared it as nullable
    var catName: String? = "Chonkers"
    catName = null                      // OK!

    var dogName: String = "Fluffy"
    // dogName = null                      // Compilerfehler!

}
