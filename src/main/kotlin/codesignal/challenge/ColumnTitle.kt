package codesignal.challenge

import kotlin.test.assertEquals

class ColumnTitle {
    
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            assertEquals("A", columnTitle(1))
            assertEquals("Z", columnTitle(26))
            assertEquals("AA", columnTitle(27))
            assertEquals("AZ", columnTitle(52))
            assertEquals("AMNXZTY", columnTitle(470211273))
            assertEquals("HMAZZU", columnTitle(101027545))
            assertEquals("FLXKHNJ", columnTitle(2007237710))
            assertEquals("BQHEHOK", columnTitle(823564441))
            assertEquals("ETDYOXY", columnTitle(1784484493))
        }

        val columnTitle = { n: Int ->
            var r = ""
            var a = n
            do  {
                var b = a % 26
                a /= 26
                if (b == 0) a--
                r = (if (b > 0) b + 64 else 90).toChar() + r
            } while (a > 0)
            r
        }
    }
}