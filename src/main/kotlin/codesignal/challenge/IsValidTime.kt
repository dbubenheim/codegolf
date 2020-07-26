package codesignal.challenge

fun validTime(t: String)= t.substring(0,2).toInt() < 25 && t.substring(3).toInt() < 60
fun validTime2(t: String)= t.split(":")[0].toInt() < 25 && t.split(":")[1].toInt() < 60
fun validTime3(t: String)= Regex("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]\$").matches(t)

fun main() {
    validTime("25:11")
}