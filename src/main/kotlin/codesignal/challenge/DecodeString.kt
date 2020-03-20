package codesignal.challenge

import kotlin.test.assertEquals

class DecodeString {


    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            assertEquals(decodeString("4[ab]"), "abababab")
            assertEquals(decodeString("2[b3[a]]"), "baaabaaa")
            assertEquals(decodeString("z1[y]zzz2[abc]"), "zyzzzabcabc")
            assertEquals(decodeString("100[codesignal]"), "codesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignalcodesignal")
        }

        val  decodeString = { s: String ->
            var r = s
            while ('[' in r ) {
                val i = r.lastIndexOf('[')
                val j = r.indexOf(']', i)
                var k = 1
                var l = ""
                while (i > k - 1 && r[i - k].isDigit()) {
                    l = r[i - k] + l
                    k++
                }

                r = r.replace(r.substring(i - k + 1, j + 1), r.substring(i + 1, j).repeat(l.toInt()))
            }
            r
        }
    }
}