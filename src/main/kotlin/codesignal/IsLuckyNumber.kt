package codesignal

class IsLuckyNumber {

    fun isLuckyNumber(n : Int) = "$n".all { it == '4' || it == '7' }

//    fun isLuckyNumber(n: Int) : Boolean {
//        var f  = n
//        while (f > 0) {
//            if (f % 10 !in listOf(4,7)) return false
//            f /= 10
//        }
//        return true
//    }

    //fun isLuckyNumber2(n: Int) : Boolean = if (n > 9) n in listOf(4,7) else n % 10 in listOf(4,7) && isLuckyNumber2(n / 10)

    //fun isLuckyNumber(n : Int) = "$n".all { it in setOf('4', '7') }

}
