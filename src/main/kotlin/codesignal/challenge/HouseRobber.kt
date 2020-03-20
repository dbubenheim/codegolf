package codesignal.challenge

import java.util.Collections.max

class HouseRobber {

    companion object {


        val houseRobber = { n: List<Int> ->

            val p = n.withIndex().partition { it.index % 2 == 0 }
            val a = p.first.sumBy { it.value }
            val b = p.second.sumBy { it.value }

            Math.max(a,b)
        }
    }


}