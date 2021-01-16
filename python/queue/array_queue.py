
# 使用数组实现一个队列

class ArrayQueue:

    def __init__(self, capacity: int):
        self.data = []
        self.size = 0
        self.capacity = capacity

    # 入队列
    def enqueue(self, val: int):
        if self.size >= self.capacity:
            raise RuntimeError('the queue is full')

        self.data.append(val)
        self.size += 1

    # 出队列
    def dequeue(self):
        if self.size <= 0:
            raise RuntimeError('the queue is empty')

        res = self.data[0]
        self.data = self.data[1:]
        self.size -= 1

        return res


if __name__ == '__main__':
    queue = ArrayQueue(10)
    queue.enqueue(12)
    queue.enqueue(19)
    queue.enqueue(10)

    print(queue.dequeue())
    print(queue.dequeue())
    print(queue.dequeue())

    queue.enqueue(100)

    print(queue.dequeue())
