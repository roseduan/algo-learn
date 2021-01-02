
# 双向链表实现

class ListNode:

    def __init__(self, val):
        self.val = val
        self.prev = None
        self.next = None


class LinkdeList:

    def __init__(self):
        self.head = None

    # 查找元素
    def find(self, val) -> ListNode:
        p = self.head
        while p and p.val != val:
            p = p.next
        return p

    # 添加节点至链表尾部
    def add(self, val) -> ListNode:
        node = ListNode(val)
        if not self.head:
            self.head = node
        else:
            p = self.head
            while p.next:
                p = p.next
            p.next = node
            node.prev = p

        return node

    # 在某个节点之后添加节点
    def addAfter(self, p: ListNode, val: int):
        if not p:
            return None
        node = ListNode(val)
        n = p.next
        node.next = p.next
        p.next = node
        node.prev = p
        if n:
            n.prev = node
        return node

    # 在某个节点之前插入节点
    def addBefore(self, p: ListNode, val: int):
        if not p:
            return None

        node = ListNode(val)
        if p == self.head:
            node.next, p.prev = p, node
            self.head = node
        else:
            prev = p.prev
            node.next, p.prev = p, node
            prev.next, node.prev = node, prev
        return node

    # 删除链表中的节点
    def delete(self, p: ListNode):
        if not p:
            return
        if p == self.head:
            self.head = p.next
        else:
            prev, back = p.prev, p.next
            prev.next = p.next
            if back:
                back.prev = prev

    # 打印所有的数据
    def print(self):
        p = self.head
        while p:
            print(p.val, end=' ')
            p = p.next
        print()


if __name__ == '__main__':
    lis = LinkdeList()
    n1 = lis.add(1)
    lis.add(5)
    n3 = lis.add(3)

    n10 = lis.addAfter(n3, 10)
    n20 = lis.addAfter(n10, 20)

    lis.print()

    lis.addBefore(n20, 15)
    h = lis.addBefore(n1, -1)
    lis.print()

    lis.delete(n1)
    lis.delete(h)
    lis.delete(n20)
    lis.print()
