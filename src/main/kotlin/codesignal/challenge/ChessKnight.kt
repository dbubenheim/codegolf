package codesignal.challenge

import kotlin.math.abs

class ChessKnight {

    val chessKnight = { c: String ->
        var s = 0
        val x = c[0].toInt() - 96
        val y = c[1].toInt() - 48
        val l = listOf(-2,-1,1,2)
        l.forEach { v ->
            l.forEach { w ->
                if (x + v in 1..8 && y + w in 1..8 && abs(v) != abs(w)) s++
            }
        }
        s
    }
}