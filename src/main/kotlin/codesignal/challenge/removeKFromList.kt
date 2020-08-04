package codesignal.challenge

data class ListNode<T>(var value: T) {
    var next: ListNode<T>? = null

    override fun toString(): String {
        return if (next != null) "$value ${next.toString()}" else "$value"
    }
}

fun removeKFromList(l: ListNode<Int>?, k: Int) = removeKFromList(l, null, l, k)

fun removeKFromList(l: ListNode<Int>?, pre: ListNode<Int>?, b: ListNode<Int>?, k: Int): ListNode<Int>? {

    if (l?.next == null) {
        if (l?.value == k) pre?.next = null
        if (b?.value == k) return null
        return b
    }

    return if (l.value == k) {
        pre?.next = l.next
        val t = if (b?.value == k) b.next else b
        removeKFromList(l.next, pre, t, k)
    } else
        removeKFromList(l.next, l, b, k)
}

fun removeKFromList2(l: ListNode<Int>?, k: Int) : ListNode<Int>? {

    if (l == null) return null

    var head = l
    while (head?.value == k) {
        head = head.next
    }

    var pre = head
    var cur = pre
    while (cur != null) {
        if (cur.value == k) {
            pre?.next = cur.next
        } else {
            pre = cur
        }
        cur = cur.next
    }

    return head
}



fun main() {
    val n0 = ListNode(3);
    val n1 = ListNode(1);
    val n2 = ListNode(2)
    val n3 = ListNode(3)
    val n4 = ListNode(4)
    val n5 = ListNode(3)
    val n6 = ListNode(5)
    val n7 = ListNode(3)
    n0.next = n1
    n1.next = n2
    n2.next = n3
    n3.next = n4
    n4.next = n5
    n5.next = n6
    n6.next = n7

    println(n0)

    val removeKFromList = removeKFromList2(n0, 3)
    println(removeKFromList)

}

