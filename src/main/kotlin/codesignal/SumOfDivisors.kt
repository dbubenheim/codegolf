package codesignal

import java.util.HashSet



class SumOfDivisors {

//    fun sumOfDivisors(n: Int) = (n downTo 1).filter { it % n < 1 }.sum()
//
//
//    fun sumOfDivisors(n: Int) : Int {
//        var x = n
//        var s = 0
//        while (x > 0)
//        {
//            s *= if (n % x < 1 ) x else 0
//        }
//        return s
//    }

    fun sumofFactors(n: Int): Int {
        var n = n
        // Traversing through all prime factors.
        var res = 1
        var i = 2
        while (i <= Math.sqrt(n.toDouble())) {


            var curr_sum = 1
            var curr_term = 1

            while (n % i == 0) {

                // THE BELOW STATEMENT MAKES
                // IT BETTER THAN ABOVE METHOD
                // AS WE REDUCE VALUE OF n.
                n = n / i

                curr_term *= i
                curr_sum += curr_term
            }

            res *= curr_sum
            i++
        }

        // This condition is to handle
        // the case when n is a prime
        // number greater than 2
        if (n > 2)
            res *= 1 + n

        return res
    }
}