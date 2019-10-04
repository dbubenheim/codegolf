package codesignal.challenge

class WaterTubes {

    val waterTubes = { w: List<Int>, f: List<Int> ->
        var x = w
        var c = 0
        while (x.any { it > 0 }) {
            x = x.mapIndexed { i, it ->  it - f[i] }
            c++
        }
        c
    }

    val waterTubes2 = { w: List<Int>, f: List<Int> ->
        //w.zip(f).maxBy { it.first - it.second }.
        w.zip(f).map {
            val a = it.first
            val b = it.second
            a / b + if (a % b < 1) 0 else 1
        }.max()
    }

    fun <T: List<Int>> waterTubes(w: T, f: T) =
        w.indices.map {
            w[it] / f[it] + if (w[it] % f[it] < 1) 0 else 1
        }

}