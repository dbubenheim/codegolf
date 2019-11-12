package codesignal

class Border {

    companion object {

        val addBorder = { p: List<String> ->
            val a = "*".repeat(p[0].length + 2)
            listOf(a, *p.map { "*$it*" }.toTypedArray(), a)
        }

        fun addBorder2(p: List<String>) =  listOf("*".repeat(p[0].length + 2), *p.map { "*$it*" }.toTypedArray(), "*".repeat(p[0].length + 2))

        @JvmStatic
        fun main(args: Array<String>) {
            println(addBorder(listOf("abc", "ded")))
        }
    }
}