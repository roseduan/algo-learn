
# k个一组翻转链表

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:

    # 暴力法，使用一个数组存储
    def reverseKGroup_1(self, head: ListNode, k: int) -> ListNode:
        arr = []
        while head:
            arr.append(head.val)
            head = head.next

        dummy = ListNode()
        cur, step = dummy, 0
        for i in range(len(arr)):
            if i == step and step + k <= len(arr):
                p, q = i, i + k - 1
                while p < q:
                    arr[p], arr[q] = arr[q], arr[p]
                    p, q = p + 1, q - 1
                step += k
            
            cur.next = ListNode(arr[i])
            cur = cur.next
        return dummy.next
