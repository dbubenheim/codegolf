package codesignal.challenge

val missingNumber = { a: List<Int> ->
     val m = a.size
     (0..m).firstOrNull { it !in a } ?: m + 1
}

fun missingNumber(a: List<Int>) = (0..a.size).firstOrNull { it !in a } ?: a.size + 1