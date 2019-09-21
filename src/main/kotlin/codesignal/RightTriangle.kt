package codesignal

class RightTriangle {

    val rightTriangle = {s: List<Int> ->
        val (a,b,c) = s.sorted()
        a*a + b*b == c*c
    }
}