package codesignal.arcade

class CircleOfNumbers {

    companion object {

        val circleOfNumbers = { n: Int, f: Int ->
            val i = f + n / 2
            if (i >= n) i - n else i
        }

        @JvmStatic
        fun main(args: Array<String>) {
            circleOfNumbers(10, 2)
        }
    }
}