package codesignal.arcade

import kotlin.test.assertEquals

fun <T : Int> knapsackLight(v1: T, w1: T, v2: T, w2: T, w: T)= when {

    w1 + w2 <= w -> v1 + v2
    w in w1 until w2 -> v1
    w in w2 until w1 -> v2
    w1 <= w && w2 <= w -> if (v1 > v2) v1 else v2
    else -> 0
}

fun main() {
    assertEquals(10, knapsackLight(10,  5, 6, 4,8))
}