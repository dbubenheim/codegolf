package codesignal.challenge

import kotlin.math.abs

class BishopDiagonal {

    companion object {

        fun bishopDiagonal(a: String, b: String) =
                if (!sameDiagonal(a, b)) listOf(a, b).sorted() else {
                    newPosition(a)
                    newPosition(b)
                    mutableListOf()
                }

        fun newPosition(a: String) : String {
            val char = a[0]
            val number = a[1]
            println("char: $char")
            println("number: $number")

            val i = char - 'a'
            val j = 'h' - char
            println("i: $i, j: $j")

            return if (i < j) {
                println("Kleiner")
                val newNumber = number - i
                val newChar = 'a'
                println("$char$number -> $newChar$newNumber")
                "$newChar$newNumber"
            } else {
                println("Groesser")
                val newNumber = number + j
                val newChar = 'h'
                println("$char$number -> $newChar$newNumber")
                "$newChar$newNumber"
            }
        }

        fun sameDiagonal(a: String, b: String) : Boolean {
            println("a: $a")
            println("b: $b")
            val b1 = abs(a[0] - b[0]) == abs(a[1] - b[1])
            println("b1: $b1")
            return b1
        }

        fun sameDiagonal2(a: String, b: String): Boolean {

            println("a: $a")
            println("b: $b")

            val char1 = a[0]
            println("char1: $char1")
            val char2 = b[0]
            println("char2: $char2")

            val number1 = a[1]
            println("number1: $number1")
            val number2 = b[1]
            println("number2: $number2")

            if (char1 < char2) {

                val diff = char2 - char1
                println("diff: $diff")

                val newNumber = if (number1 > number2) number1 - diff else number2 - diff
                println("n: $newNumber")
                val s1 = "${char2 - diff}${newNumber}"
                println("s1: $s1")
                return b == s1

            } else {

                val diff = char1 - char2
                println("diff: $diff")

                val newNumber = if (number1 > number2) number1 - diff else number2 - diff
                Pair(char1 - diff, newNumber)
                println("n: $newNumber")
                val s2 = "${char2 - diff}${newNumber}"
                println("s2: $s2")
                return a == s2
            }
        }
    }
}

fun main() {

    BishopDiagonal.bishopDiagonal("d7", "f5")
    BishopDiagonal.bishopDiagonal("a1", "h8")
    BishopDiagonal.bishopDiagonal("c4", "b2")
}