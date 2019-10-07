package codesignal.challenge

class Decipher {

    companion object {

        val decipher = { c: String ->
            var s = ""
            var t = ""
            c.map {
                t += it
                val i = t.toInt()
                if (i in 97..122) {
                    s += i.toChar()
                    t = ""
                }
            }
            s
        }
    }
}

fun main() {

    println(Decipher.decipher("10197115121"))
}