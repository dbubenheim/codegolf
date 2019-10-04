package codesignal.challenge

/*
 * https://app.codesignal.com/challenge/KbNFxbXFsiokxCDJF
 */
class ElectionWinners {

    val electionsWinners = { v: List<Int>, k: Int ->
        val m = v.max() ?: 0
        val o = v.count { it == m } < 2
        v.count { o && it == m || it + k > m }
    }
}