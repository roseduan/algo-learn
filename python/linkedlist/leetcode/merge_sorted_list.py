
# 合并两个有序链表
# https://leetcode-cn.com/problems/merge-two-sorted-lists/solution


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:

    # 迭代
    def mergeTwoLists_1(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy = ListNode(-1)
        p = dummy
        while l1 and l2:
            if l1.val < l2.val:
                p.next = l1
                l1 = l1.next
            else:
                p.next = l2
                l2 = l2.next
            p = p.next
        p.next = l1 if l1 else l2
        return dummy.next

    # 递归
    def mergeTwoLists_2(self, l1: ListNode, l2: ListNode) -> ListNode:
        def helper(p, node1, node2):
            if not node1 or not node2:
                p.next = node1 if node1 else node2
                return
            if node1.val < node2.val:
                p.next = node1
                helper(p.next, node1.next, node2)
            else:
                p.next = node2
                helper(p.next, node1, node2.next)
        dummy = ListNode(-1)
        p = dummy
        helper(p, l1, l2)
        return dummy.next

    # 高票答案的递归写法，学习一下
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if not l1:
            return l2
        if not l2:
            return l1
        if l1.val < l2.val:
            l1.next = self.mergeTwoLists(l1.next, l2)
            return l1
        else:
            l2.next = self.mergeTwoLists(l1, l2.next)
            return l2
