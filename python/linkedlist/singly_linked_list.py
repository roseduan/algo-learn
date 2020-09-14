
# 单链表实现


# 节点定义
class ListNode:

    def __init__(self, val):
        self.next = None
        self.val = val


class LinkedList:

    def __init__(self):
        self.head = None

    # 根据值查找节点
    def find(self, val):
        p = self.head
        while p and p.val != val:
            p = p.next
        return p

    # 添加节点
    def add(self, val) -> ListNode:
        node = ListNode(val)
        if not self.head:
            self.head = node
        else:
            p = self.head
            while p and p.next:
                p = p.next
            if p:
                p.next = node
        return node

    # 在某个节点之前添加
    def addBefore(self, p: ListNode, val):
        if not p:
            return
        node = ListNode(val)
        # 在头节点之前插入
        if p is self.head:
            node.next = self.head
            self.head = node
        else:
            prev = self.head
            while prev and prev.next != p:
                prev = prev.next
            if prev:
                node.next = p
                prev.next = node

    # 在某个节点之后插入
    def addAfter(self, p: ListNode, val):
        if not p:
            return
        node = ListNode(val)
        p.next = node

    # 打印所有元素值
    def print(self):
        if not self.head:
            return
        p = self.head
        while p:
            print(p.val, end=' ')
            p = p.next


if __name__ == '__main__':
    lis = LinkedList()
    lis.add(1)
    e3 = lis.add(3)
    lis.add(5)

    lis.addBefore(e3, 14)
    lis.addBefore(e3, 15)

    n = lis.find(12)

    print(n.val if n else None)

    lis.print()
