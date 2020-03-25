package codesignal.challenge

val lineUp = { c: String ->
    var s = 0
    var l = 0
    c.forEach {
        if (it in "LR") l++
        if (l % 2 != 0) s++
    }
    s
}