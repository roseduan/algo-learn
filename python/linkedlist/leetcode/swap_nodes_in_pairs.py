
# 两两交换链表节点

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:

    # 迭代
    def swapPairs_1(self, head: ListNode) -> ListNode:
        dummy = ListNode()
        p, dummy.next = dummy, head
        while p.next and p.next.next:
            prev, back = p.next, p.next.next
            p.next, prev.next, back.next = back, back.next, prev
            p = p.next.next
        return dummy.next

    # 递归
    def swapPairs_2(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        cur = head.next
        head.next = self.swapPairs_2(cur.next)
        cur.next = head
        return cur
