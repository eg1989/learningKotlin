fun main(args: Array<String>) {
    var i = 0
    var j = 0
    while (i < 10) {
        while (j < 10) {
           print("$i,$j \t")
            j++
        }
        j = 0   // zurücksetzen, weil neue Zeile
        println()   // neue Zeile
        i++     // neue Zeile
    }
}
