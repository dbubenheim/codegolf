package codesignal

var s = 1
val leastFactorial = { n: Int ->
    (1..n).takeWhile {
        s *= it
        s < n
    }
    s
}