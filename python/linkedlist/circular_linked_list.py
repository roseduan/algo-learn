
# 循环链表实现

class ListNode:

    def __init__(self, val):
        self.val = val
        self.prev = None
        self.next = None


class LinkedList:

    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    # 添加元素至链表尾部
    def add(self, val: int):
        node = ListNode(val)
        if not self.head:
            self.head = node
        if self.tail:
            self.tail.next = node

        self.tail = node
        self.tail.next = self.head
        self.size += 1

    # 在某个节点之后添加节点
    def addAfter(self, p: ListNode, val: int):
        if not p:
            return
        node = ListNode(val)
        node.next = p.next
        p.next = node

        if p == self.tail:
            self.tail = node
            self.tail.next = self.head
        self.size += 1

    # 根据值删除节点
    def delete(self, val: int):
        node = self.find(val)
        if node is None:
            return

        if node == self.head:
            self.head = self.head.next
        else:
            prev = lis.head
            for i in range(self.size):
                if prev.next == node:
                    break
            prev.next = node.next.next
        self.size -= 1

    # 根据元素值查找节点
    def find(self, val: int):
        p = self.head
        for i in range(self.size):
            if p.val == val:
                return p
            p = p.next
        return p

    # 打印链表中所有元素
    def print(self):
        p = self.head
        for i in range(self.size):
            print(p.val, end=' ')
            p = p.next
        print()

    def __size__(self):
        return self.size


if __name__ == '__main__':
    lis = LinkedList()
    lis.add(10)

    lis.delete(10)
    lis.print()

    lis.add(8)
    lis.add(21)
    lis.add(3)
    lis.add(9)

    print(lis.__size__())

    lis.print()

    n = lis.find(10)
    print(n.val)

    lis.addAfter(n, 15)
    lis.print()

    n9 = lis.find(9)
    lis.addAfter(n9, 24)
    lis.print()

    lis.delete(24)
    lis.print()
    print(lis.size)
