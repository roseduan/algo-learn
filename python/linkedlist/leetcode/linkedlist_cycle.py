
# 判断链表是否有环
# https://leetcode-cn.com/problems/linked-list-cycle

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:

    # 使用一个set
    def hasCycle_1(self, head: ListNode) -> bool:
        s = set()
        while head:
            if head in s:
                return True
            s.add(head)
            head = head.next
        return False

    # 快慢指针
    def hasCycle_2(self, head: ListNode) -> bool:
        slow, fast = head, head
        while fast and fast.next:
            slow, fast = slow.next, fast.next.next
            if slow == fast:
                return True
        return False
