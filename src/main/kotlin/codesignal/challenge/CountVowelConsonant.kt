package codesignal.challenge

import kotlin.test.assertEquals

class CountVowelConsonant {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            assertEquals(countVowelConsonant("a"), 1)
            assertEquals(countVowelConsonant("abcde"), 8)
            assertEquals(countVowelConsonant("oqaawtnkqo"), 16)
        }

        fun countVowelConsonant(s: String) = s.sumBy { if (it in "aeiou") 1 else 2 }
    }
}