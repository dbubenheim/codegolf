package codesignal.arcade

import kotlin.math.abs

class ChessBoardCellColor {

    companion object {

        val chessBoardCellColor = { a: String, b: String ->
            val i = abs(a[0] - b[0])
            val j = abs(a[1] - b[1])
            i % 2 < 1 && j % 2 < 1 || j % 2 > 0
        }

        @JvmStatic
        fun main(args: Array<String>) {
            chessBoardCellColor("A1", "H6")
        }
    }
}