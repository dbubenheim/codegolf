package codesignal.challenge

class SumOfMultiples {

    companion object {

        fun sumOfMultiples(n: Int, k: Int) = (0..n).sumBy { if (it * k < n) it * k else 0 }
    }
}
