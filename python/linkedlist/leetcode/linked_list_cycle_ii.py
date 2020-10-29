
# 环形链表II

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    # 使用一个set
    def detectCycle_1(self, head: ListNode) -> ListNode:
        s = set()
        while head:
            if head in s:
                return head
            s.add(head)
            head = head.next

    # 快慢指针法
    def detectCycle_2(self, head: ListNode) -> ListNode:
        slow, fast = head, head
        while fast and fast.next:
            slow, fast = slow.next, fast.next.next
            if slow == fast:
                slow = head
                while slow != fast:
                    slow, fast = slow.next, fast.next
                return slow
