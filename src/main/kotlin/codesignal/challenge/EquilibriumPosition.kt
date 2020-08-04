package codesignal.challenge

import kotlin.math.min
import kotlin.test.assertEquals

fun equilibriumPoint6(a: List<Int>): Int {

    var c = 0
    val s = a.size
    var b = a.subList(1, s).sum()
    for (x in 1..s - 2) {
        if (c == b) return x
        c += a[x - 1]
        b -= a[x]
    }
    return -1
}

val equilibriumPoint1 = { a: List<Int> ->

    var e = -1
    var c = 0
    var b = a.subList(1, a.size).sum()
    if (c == b)
        e = 1
    else {
        for (x in 0..a.size - 2) {
            c += a[x]
            b -= a[x + 1]
            if (c == b) e = x + 2
        }
    }
    e
}

fun equilibriumPoint2(a: List<Int>): Int {

    a.indices.forEach {
        val c = a.subList(0, it).sum()
        val b = a.subList(it + 1, a.size).sum()
        if (c == b) return it + 1
    }

    return -1
}

val equilibriumPoint5: (List<Int>) -> Int = l@{ a ->

    var c = 0
    val s = a.size
    var b = a.subList(1, s).sum()
    if (c == b) return@l 1

    for (x in 0..s - 2) {
        c += a[x]
        b -= a[x + 1]
        if (c == b) return@l x + 2
    }
    -1
}

fun equilibriumPoint3(a: List<Int>): Int {

    var b = a.sum()
    var c = 0
    var i = 0
    for ((x, y) in a.withIndex()) {
        b -= x
        if (c == b) return y + 1
        c += x
    }
    return -1
}

val equilibriumPoint = l@{ a: List<Int> ->

    var c = 0
    var b = a.sum()
    var i = 0
    for (x in a) {
        b -= x
        if (c == b) return@l ++i
        c += x
        i++
    }
    -1
}

fun main() {

    assertEquals(4, equilibriumPoint(listOf(1, 2, 3, 4, 3, 2, 1)))
    assertEquals(4, equilibriumPoint(listOf(10, 5, 3, 5, 2, 2, 6, 8)))
    assertEquals(1, equilibriumPoint(listOf(1, -1, 1, -1, 1)))
    assertEquals(1, equilibriumPoint(listOf(1, -5, 2, 3)))
    assertEquals(4, equilibriumPoint(listOf(2, 3, -5, 100)))
    assertEquals(-1, equilibriumPoint(listOf(1, 3, 5, 2, 3)))
}



