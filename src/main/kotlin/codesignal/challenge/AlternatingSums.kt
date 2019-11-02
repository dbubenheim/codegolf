package codesignal.challenge

class AlternatingSums {

    companion object {

        val alternatingSums1 = { a: List<Int> ->
            val p = a.withIndex().partition { it.index % 2 > 0 }
            listOf(p.first.map { it.value }.sum(), p.second.map { it.value }.sum())
        }

        val alternatingSums2 = { a: List<Int> ->
            var b = 0
            var c = 0
            for ((i, v) in a.withIndex()) {
                if (i % 2 < 1) b += v else c += v
            }
            listOf(b, c)
        }

        @JvmStatic
        fun main(args: Array<String>) {

            val alternatingSums = alternatingSums2(listOf(1, 2, 3, 4, 5, 6))
            println(alternatingSums)
        }
    }
}