package codesignal.challenge


class ConcatenateArrays {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            println(concatenateArrays(listOf(0,1,2), listOf(2,3,4)))
            println(concatenateArrays(listOf(1,6,5,8), listOf(8,2,4,3)))
        }

        fun concatenateArrays(a: List<*>, b: List<*>) = a + b
    }
}
