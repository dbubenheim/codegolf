package codesignal.challenge

class Distinct {

    fun sameElementsNaive(a: List<Int>, b: List<Int>) = a.filter { b.contains(it) }.size
    fun sameElementsNaive2(a: List<Int>, b: List<Int>) = a.count { it in b }
    fun sameElementsNaive3(a: List<Int>, b: List<Int>) = a intersect b
    fun sameElementsNaive4(a: List<Int>, b: List<Int>) = (a - b).size
    val sameElementsNaive5 = { a: List<Int>, b: List<Int> -> (a intersect b).size }
}