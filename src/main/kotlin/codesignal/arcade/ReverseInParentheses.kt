package codesignal.arcade

import kotlin.test.assertEquals

val reverseInParentheses = { i: String ->
    var e = i
    while ('(' in e) {
        val p = e.lastIndexOf('(')
        val o = e.substring(p, e.indexOf(')', p) + 1)
        e = e.replace(o, o.substring(1, o.length - 1).reversed())
    }
    e
}

fun main() {
    assertEquals("rab", reverseInParentheses("(bar)"))
    assertEquals("foobazrabblim", reverseInParentheses("foo(bar(baz))blim"))
}