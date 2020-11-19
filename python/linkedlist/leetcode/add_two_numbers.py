
# 两数相加

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy = ListNode()
        cur, p, q, count = dummy, l1, l2, 0
        while p or q:
            if p: p, count = p.next, count + p.val
            if q: q, count = q.next, count + q.val
            cur.next = ListNode(val=count % 10)
            cur, count = cur.next, count // 10
        if count > 0:
            cur.next = ListNode(count)
        return dummy.next
