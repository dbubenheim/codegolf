package codesignal.challenge

class FirstReverseTry {

    val firstReverseTry = { a: MutableList<Int> ->
        val s = a.size
        if (s > 0)
            a[0] = a[s - 1].also { a[s - 1] = a[0] }
        a
    }
}