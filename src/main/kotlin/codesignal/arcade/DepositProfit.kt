package codesignal.arcade

import kotlin.test.assertEquals

val depositProfit = { d: Int, r: Int, t: Int ->
    var e = d.toDouble()
    var c = 0
    while (e < t) {
        e += (e * r / 100.0)
        c++
    }
    c
}

fun main() {
    assertEquals(3, depositProfit(100, 20, 170))
}