package codesignal.challenge

fun distinctDistances(d: List<Int>) : Int {
    val sorted = d.sorted()
    return if (sorted[0] + sorted[1] <= sorted[2]) 3 else 4
}

fun distinctDistances2(d: List<Int>) = if (d[0] + d[1] < d[2]) 4 else 3