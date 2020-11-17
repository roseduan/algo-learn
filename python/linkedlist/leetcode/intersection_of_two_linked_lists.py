
# 相交链表

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:

    # 使用一个set
    def getIntersectionNode_1(self, headA: ListNode, headB: ListNode) -> ListNode:
        s = set()
        while headA:
            s.add(headA)
            headA = headA.next
        while headB:
            if headB in s:
                return headB
            headB = headB.next
        return None

    # 双指针法
    def getIntersectionNode_2(self, headA: ListNode, headB: ListNode) -> ListNode:
        p, q = headA, headB
        while p != q:
            p = p.next if p else headB
            q = q.next if q else headA
        return p
