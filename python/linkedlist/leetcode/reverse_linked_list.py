from typing import List


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:

    # 迭代
    def reverseList1(self, head: ListNode) -> ListNode:
        prev, back = None, head
        while back:
            back.next, prev, back = prev, back, back.next
        return prev

    # 递归
    def reverseList2(self, head: ListNode) -> ListNode:
        def helper(prev, cur) -> ListNode:
            if not cur:
                return prev
            n = cur.next
            cur.next = prev
            return helper(cur, n)
        return helper(None, head)
        