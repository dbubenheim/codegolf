package codesignal.challenge

import codesignal.challenge.EvenNumbersBeforeFixed.Companion.evenNumbersBeforeFixed

class EvenNumbersBeforeFixed {

    companion object {

        fun evenNumbersBeforeFixed(s: List<Int>, f: Int): Int {
            var i = 0
            for (k in s) {
                if (k == f) return i
                if (k % 2 < 1) i++
            }
            return -1
        }

        val evenNumbersBeforeFixed = { s: List<Int>, f: Int ->
            val t = s.takeWhile { it != f }
            if (t == s) -1 else t.filter { it % 2 < 1 }.size
        }

        fun evenNumbersBeforeFixed2(s: List<Int>, f: Int) =
                if (s.all { it != f }) -1 else s.takeWhile { it != f }.filter { it % 2 < 1 }.size

        val evenNumbersBeforeFixed2 = { s: List<Int>, f: Int ->
            var i = s.indexOf(f)
            (0..i).forEach {
                if (it % 2 < 1) i++
            }
            i
        }
    }
}

fun main() {
    println(evenNumbersBeforeFixed(listOf(1, 4, 2, 6, 3, 1), 6))
    println(evenNumbersBeforeFixed(listOf(2, 3, 4, 3), 3))
}
