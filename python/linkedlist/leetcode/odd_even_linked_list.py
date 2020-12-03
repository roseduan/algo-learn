# 奇偶链表


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def oddEvenList(self, head: ListNode) -> ListNode:
        if not head:
            return head

        evenHead = head.next
        odd, even = head, head.next
        while even and even.next:
            odd.next, odd = even.next, even.next
            even.next, even = odd.next, odd.next
        odd.next = evenHead
        return head
