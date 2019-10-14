package codesignal.challenge

// https://app.codesignal.com/challenge/keqZL6SYysHeyoEuQ
fun reflectString(i: String) = i.fold("") { a, b -> a + ('z' - (b - 'a')) }