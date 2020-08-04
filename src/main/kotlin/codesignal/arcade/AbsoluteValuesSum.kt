package codesignal.arcade

import kotlin.test.assertEquals


val absoluteValuesSumMinimization = { a: List<Int> ->

    var e = Int.MAX_VALUE
    var y = 0
    a.indices.forEach { x ->
        val t = a.sumBy { Math.abs(it - a[x]) }
        if (t < e) {
            e = t
            y = a[x]
        }
    }
    y
}

fun main() {

    // assertEquals(4, absoluteValuesSumMinimization(listOf(2, 4, 7)))

    //print("abcdabd".chars().distinct().count())

    //print(arrayMaxConsecutiveSum(listOf(2, 3, 5, 1, 6), 2))
    //println(arrayMaxConsecutiveSum(listOf(1, 3, 2, 4), 3))
    println(arrayMaxConsecutiveSum(listOf(2, 3, 5, 1, 6), 2))
}

fun arrayMaxConsecutiveSum(i: List<Int>, k: Int): Int {

    var max = i.subList(0, k).sum()
    var last = max
    var x = 1
    while (x + k <= i.size) {
        val i1 = i[x - 1]
        val i2 = i[x + k - 1]
        val cur = last - i1 + i2
        if (cur > max) max = cur
        last = cur
        x++
    }
    return max

//    val windowed = i.windowed(k)
//    val map = windowed.map { it.sum() }
//    val slice = map.max()
//    return slice!!
}