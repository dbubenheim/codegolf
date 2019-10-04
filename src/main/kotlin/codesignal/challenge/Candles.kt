package codesignal.challenge

import codesignal.challenge.Candles.Companion.candles

class Candles {

    companion object {


        val candles = { c: Int, n: Int ->
            println("WHAAAT")
            var s = c
            println("s: $s")
            var t = c
            println("t: $t")
            while (t / n >= n) {
                s += t / n
                println("s: $s")
                t = t / n + t % n
                println("t: $t")
            }
            println("Result: $s")
            s
        }
    }


}

fun main() {

    candles(5, 2)
}
