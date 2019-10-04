package codesignal.arcade

class AlphabeticShift {

    fun alphabeticShift(i: String) = i.map { if (it == 'z') 'a' else it + 1 }.joinToString("")
}