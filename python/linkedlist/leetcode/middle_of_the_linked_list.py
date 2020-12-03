
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    # 使用一个数组存储
    def middleNode_1(self, head: ListNode) -> ListNode:
        arr = []
        while head:
            arr.append(head)
            head = head.next
        return arr[len(arr) // 2]

    # 快慢指针法
    def middleNode_2(self, head: ListNode) -> ListNode:
        slow, fast = head, head
        while fast and fast.next:
            slow, fast = slow.next, fast.next.next
        return slow
        