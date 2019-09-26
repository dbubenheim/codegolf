package codesignal

fun knapsackLight2(a: Int, b: Int, m: Int) = when {
    a + b <= m -> "both"
    a > m && b > m -> "none"
    a <= m -> "first"
    b <= m -> "second"
    else -> "either"
}