fun main(args: Array<String>) {
    print("Enter the student's score: ")
    val score = readLine()?.toInt() ?: 0

    val grade = if (score >= 90)  "A"
    else if (score >= 80) "B"
    else if (score >= 70) "C"
    else if (score >= 60) "D"
    else if (score >= 50) "E"
    else "F"

    println("Student score is $score, therefore his Grade is $grade")
}
