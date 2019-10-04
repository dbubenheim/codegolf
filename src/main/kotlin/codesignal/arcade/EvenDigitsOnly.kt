package codesignal.arcade

class EvenDigitsOnly {

    fun evenDigitsOnly(n: Int) = "$n".all { it in "02468" }
}