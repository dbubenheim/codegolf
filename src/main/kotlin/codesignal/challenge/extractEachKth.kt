package codesignal.challenge

import kotlin.test.assertEquals
import kotlin.test.assertTrue

fun extractEachKth(i: List<Int>, k: Int) = i.filterIndexed { a, _ -> (a + 1) % k > 0 }

fun extractEachKth2(i: MutableList<Int>, k: Int) = i.removeAll { i.indexOf(it) % k > 0 }

fun main() {

    assertTrue(extractEachKth(listOf(1, 1, 1, 1, 1), 1).isEmpty())
    assertEquals(extractEachKth(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3), listOf(1, 2, 4, 5, 7, 8, 10))
}