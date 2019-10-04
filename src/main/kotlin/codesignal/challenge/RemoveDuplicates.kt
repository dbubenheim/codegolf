package codesignal.challenge

fun removeDuplicateCharacters(s: String) =
    s.groupBy { it }.toString()
