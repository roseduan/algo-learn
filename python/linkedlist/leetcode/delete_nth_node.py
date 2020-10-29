
# 删除链表倒数第N个节点

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:

    # 先计数，再删除
    def removeNthFromEnd_1(self, head: ListNode, n: int) -> ListNode:
        def length(node: ListNode) -> int:
            k = 0
            while node:
                k, node = k + 1, node.next
            return k

        dummy = ListNode(0, head)
        length = length(head)
        cur = dummy
        for _ in range(1, length - n + 1):
            cur = cur.next
        cur.next = cur.next.next
        return dummy.next

    # 快慢指针，一次遍历
    def removeNthFromEnd_2(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode(0, head)
        slow, fast = dummy, head
        for _ in range(n):
            fast = fast.next
        while fast:
            slow, fast = slow.next, fast.next
        slow.next = slow.next.next
        return dummy.next
