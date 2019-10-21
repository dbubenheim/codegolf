package codesignal.challenge

import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IsSumOfConsecutive {

    companion object {

        fun isSumOfConsecutive2(n: Int) : Boolean {
            for (i in 1..n-1) {
                var s = 0
                for (j in (i + 1)..n-1) {
                    s += j
                    if (s == n) {
                        return true
                    }
                }
            }
            return false
        }

        fun isSumOfConsecutive(n: Int) = (1..n-1).any { i ->
            var s = 0
            for (j in (i + 1)..n-1) {
                println("s += j: $s += $j -> ${s + j}")
                s += j
                if (s == n) {
                    println("s == n: $s == $n")
                    return true
                }
            }
            return false
        }

        @JvmStatic
        fun main(args: Array<String>) {

            assertTrue(isSumOfConsecutive(9))
            assertFalse(isSumOfConsecutive(8))
            assertFalse(isSumOfConsecutive(1))
            assertTrue(isSumOfConsecutive(42))
            assertTrue(isSumOfConsecutive(110))
        }
    }
}
