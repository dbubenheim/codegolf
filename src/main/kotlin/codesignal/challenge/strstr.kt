package codesignal.challenge


fun strstr(s: String, x: String) = s.indexOf(x)
fun strstr2(s: String, x: String) : Int {

    //var set = mutableSetOf<Int>()
    val chars = s.toCharArray()
    if (chars.isEmpty()) return -1

    val xChars = x.toCharArray()
    if (xChars.isEmpty()) return -1

    val firstX = x[0]

    // chars.firstOrNull { it == firstX } ?: return -1

//    chars.forEachIndexed { i, sc ->
//        if (sc == firstX) {
//            if (s.length >= i + x.length && s.substring(i, i + x.length) == x) return i else i += x.length
//        }
//    }

//    xChars.forEachIndexed { i, xc ->
//        var found = false
//        chars.forEachIndexed { j, sc ->
//            if (xc == sc) {
//                found = true
//                if (sc == firstX) {
//                    if (s.length >= i + x.length && s.substring(i, i + x.length) == x) return i
//                    //set.add(i)
//                }
//            }
//        }
//        if (!found) return -1
//    }

//    chars.mapIndexed {
//        index, c ->  if (c !in xChars) return -1 else if (c == x[0]) set.add(index)
//    }
    //return chars.mapIndexed { i, c ->  if (c == x[0] && s.length > i + x.length && s.substring(i, i + x.length) == x) i else null }.filterNotNull().firstOrNull() ?: -1

//    if (set.isEmpty()) return -1

//    set.forEach { i ->
//        if (s.length >= i + x.length && s.substring(i, i + x.length) == x) return i
//    }

    return -1
}