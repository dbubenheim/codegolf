package codesignal

class IsUppercase {

    // 38 Characters
    fun isUppercase(s: Char) = s.isUpperCase()

    // 34 Characters
    fun isUppercase2(s: Char) = s in 'A'..'Z'

}


fun sumOfPowers(n: Int, d: Int) : Int {
    return (1..n).sumBy { i ->

        //println("i: $i")
        var cur = 0
        run loop@{
        (n downTo 0).forEach { k ->
            //println("k: $k")
            val p = Math.pow(d.toDouble(), k.toDouble())
            //println("p: $p")
            val f = i % p
            //println("f: $f")
            if (f == 0.0) {
                println("Aktuelles k: $k")
                cur += k
                println("cur: $cur")
                return@loop
            }
        }
        }

        println("cur: $cur")
        cur
    }.also { println("Ergebnis: n: $n, d: $d = $it") }
}


fun main(args: Array<String>) {

    //sumOfPowers(2, 2)
    //sumOfPowers(10, 3)
    sumOfPowers(20, 4)
}


fun sumOfPowers2(n: Int, d: Int) =
        (1..n).sumBy {
            (n downTo 0).first { k -> it % Math.pow(d + .0, k + .0) < .0 }
        }