
# 实现一个循环队列

class CircularQueue:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.data = []
        self.size = 0
        self.head = 0
        self.tail = 0

    # 入队列
    def enque(self, val: int):
        if self.isFull():
            raise Exception('the queue is full')

        self.data.append(val)
        self.tail = (self.tail + 1) % self.capacity
        self.size += 1

    # 出队列
    def deque(self) -> int:
        if self.isEmpty():
            raise Exception('the queue is empty')

        res = self.data[self.head]
        self.head = (self.head + 1) % self.capacity
        self.size -= 1
        return res

    def isEmpty(self) -> bool:
        return self.size == 0

    def isFull(self) -> bool:
        return self.size >= self.capacity


if __name__ == '__main__':
    queue = CircularQueue(5)
    queue.enque(1)
    queue.enque(4)
    queue.enque(2)
    queue.enque(5)

    print(queue.deque())
    print(queue.deque())
    print(queue.deque())
    print(queue.deque())
    # print(queue.deque())
