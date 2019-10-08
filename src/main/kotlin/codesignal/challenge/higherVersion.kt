package codesignal.challenge

class HigherVersion {

    companion object {

        fun higherVersion(a: String, b: String): Boolean {
            for (t in a.split(".").zip(b.split("."))) {
                val f = t.first.toInt()
                val g = t.second.toInt()
                if (f != g) return f > g
            }
            return false
        }
    }
}

fun main() {

    println(HigherVersion.higherVersion("1.12.123", "1.12.111"))
    println(HigherVersion.higherVersion("2.12.123", "3.12.111"))
    println(HigherVersion.higherVersion("1.12.123", "2.12.111"))
    println(HigherVersion.higherVersion("2.2.2", "2.2.1"))
    println(HigherVersion.higherVersion("1.1.1", "1.0.1"))
}

