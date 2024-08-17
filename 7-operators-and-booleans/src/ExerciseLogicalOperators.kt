fun main(args: Array<String>) {
    val cows = 3
    val cowsProducingMilk = 1
    val children = 2

    val familyMembers = children + 1

    val fundingReceived = ((cows <= 5) && (cowsProducingMilk > 0)) || (familyMembers >= 3)
    println("Does the farmer receive the funding? $fundingReceived")
}
