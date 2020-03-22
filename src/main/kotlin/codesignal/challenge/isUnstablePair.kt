package codesignal.challenge

import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IsUnstablePair {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            assertTrue(isUnstablePair("aa", "AAB"))
            assertFalse(isUnstablePair("A", "z"))
            assertFalse(isUnstablePair("Azzzzzzzzz", "yyyyyyyyy"))
        }

        fun <T: String> isUnstablePair(a: T, b: T) =
                a < b.toUpperCase() != a < b.toLowerCase()

    }

}
