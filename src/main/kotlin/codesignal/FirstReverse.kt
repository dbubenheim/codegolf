package codesignal

class FirstReverse {

    fun firstReverseTry(a: MutableList<Int>) = a.also { l ->
        if (l.isEmpty()) return l
        val i = l.lastIndex
        l[0] = l[i].also { l[i] = l[0] }
    }
}