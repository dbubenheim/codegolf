package codesignal.challenge

fun insideCircle(p: List<Int>, c: List<Int>, r: Int) =
        Math.sqrt(Math.pow(c[0] - p[0] + 0.0, 2.0) + Math.pow(c[1] - p[1] + 0.0, 2.0)) <= r