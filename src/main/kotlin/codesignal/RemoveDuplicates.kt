package codesignal

fun removeDuplicateCharacters(s: String) =
    s.groupBy { it }.toString()
