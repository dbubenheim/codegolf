package codesignal.challenge

class NumberOfEvenDigits {

    fun numberOfEvenDigits(n: Int) = "$n".count { it.toInt() % 2 < 1 }
}