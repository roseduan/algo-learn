
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
        # 找到中间节点
        slow, fast = head, head
        while fast and fast.next:
            slow, fast = slow.next, fast.next.next
        
        mid = slow
        if fast:
            mid = slow.next

        # 反转mid->tail的节点
        prev, back = None, mid
        while back:
            back.next, prev, back = prev, back, back.next
        
        # 依次遍历并比较
        while prev and head != slow:
            if prev.val != head.val:
                return False
            prev, head = prev.next, head.next
        return True
