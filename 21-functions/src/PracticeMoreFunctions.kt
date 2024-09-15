fun main(args: Array<String>) {
    for (i in 1..3) {
        println(add(i*6,i*3))
    }
    
    val products = hashMapOf(Pair("shoes", 29.99), Pair("socks", 5.99), Pair("jeans", 39.99))
    for (productKey in products.keys) {
        println("Price of $productKey is ${taxMultiplier(products[productKey]!!)} after tax")
    }
}

fun add(a: Int, b: Int): Int = a + b

fun taxMultiplier(beforeTax: Double) : Double = beforeTax * 1.2
