package codesignal.challenge

import kotlin.test.assertEquals
import kotlin.test.assertFalse

class SumOfTwo {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            assertFalse(sumOfTwo( listOf(1, 2, 3), listOf(10, 20, 30, 40), 42))
        }


        fun sumOfTwo3(a: List<Int>, b: List<Int>, v: Int) : Boolean {
            a.toSet().filter { it < v }.forEach { c ->
                b.toSet().filter { it < v }.forEach {
                    if (c + it == v) return true
                }
            }
            return false
        }

        fun <T : List<Int>> sumOfTwo2(a: T, b: T, v: Int) =
                a.filter { it <= v }.map { v - it }.toSet().firstOrNull { it in b } != null


        val  sumOfTwo = { a: List<Int>, b: List<Int>, v: Int ->
            val d = b.toSet()
            a.toSet().map { v - it }.any { it in d }
        }
    }
}