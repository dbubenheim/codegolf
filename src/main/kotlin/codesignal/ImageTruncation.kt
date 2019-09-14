package codesignal

class ImageTruncation {

    fun imageTruncation(i: List<List<Int>>, t: Int) =
            i.map { it.map { minOf(it, t) } }
}