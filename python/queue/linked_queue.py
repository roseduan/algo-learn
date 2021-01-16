
# 使用链表实现一个栈

class ListNode:
    def __init__(self, val: int):
        self.val = val
        self.next = None


class LinkedQueue:

    def __init__(self, capacity: int):
        self.head = None
        self.tail = None
        self.size = 0
        self.capacity = capacity

    # 入队列
    def enqueue(self, val: int):
        if self.isFull():
            raise RuntimeError('the queue is full')

        node = ListNode(val)
        if self.tail:
            self.tail.next = node
        if not self.head:
            self.head = node

        self.tail = node
        self.size += 1

    # 出队列
    def dequeue(self):
        if self.isEmpty():
            raise RuntimeError('the queue is empty')

        res = self.head.val
        self.head = self.head.next
        self.size -= 1

        return res

    # 队列是否已满
    def isFull(self) -> bool:
        return self.size >= self.capacity

    # 队列是否已空
    def isEmpty(self) -> bool:
        return self.size <= 0


if __name__ == '__main__':
    queue = LinkedQueue(10)
    queue.enqueue(4)
    queue.enqueue(3)
    queue.enqueue(1)
    queue.enqueue(5)

    print(queue.dequeue())
    print(queue.dequeue())
    print(queue.dequeue())
    print(queue.dequeue())

    queue.enqueue(10)
    print(queue.dequeue())

    print(queue.isFull())
    print(queue.isEmpty())
