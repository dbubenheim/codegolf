package codesignal.arcade

class AvoidObstacles {

    val avoidObstacles = { a: List<Int> ->
        val m = (a.max() ?: 0)
        (1..m).firstOrNull { i -> !a.any { it % i < 1 } } ?: m + 1
    }
}