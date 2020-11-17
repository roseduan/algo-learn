
# 回文链表

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:

    # 使用一个数组存储
    def isPalindrome_1(self, head: ListNode) -> bool:
        data = []
        while head:
            data.append(head.val)
            head = head.next
        return data == data[::-1]

    # 原地遍历，快慢指针
    def isPalindrome_2(self, head: ListNode) -> bool:
        slow, fast = head, head
        while fast and fast.next:
            slow, fast = slow.next, fast.next.next
        
        if not fast:
            slow = slow.next
            
        prev, back = None, slow
        while back:
            back.next, prev, back = prev, back, back.next
        while head:
            if head.val != prev.val:
                return False
            head, prev = head.next, prev.next
        return True
