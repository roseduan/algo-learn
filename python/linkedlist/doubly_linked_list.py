
# 双向链表实现

class ListNode:

    def __init__(self, val):
        self.val = val
        self.prev = None
        self.next = None


class LinkdeList:

    def __init__(self):
        self.head = None
        self.size = 0
    
    # 查找元素
    def find(self, val) -> ListNode:
        p = self.head
        while p and p.val != val:
            p = p.next
        return p

    # 添加节点至链表尾部
    def pushBack(self, val) -> ListNode:
        node = ListNode(val)
        if not self.head:
            self.head = node
        else:
            p = self.head
            while p.next:
                p = p.next
            p.next = node
            node.prev = p

        self.size += 1
        return node

    # 打印所有的数据
    def print(self):
        p = self.head
        while p:
            print(p.val, end=' ')
            p = p.next
        print()
