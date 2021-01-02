
# 使用数组实现的栈

class ArrayStack:

    def __init__(self, capacity: int):
        self.data = []
        self.size = 0
        self.capacity = capacity

    # 入栈
    def push(self, val: int):
        if self.size >= self.capacity:
            raise RuntimeError('the stack is full')
        self.data.append(val)
        self.size += 1

    # 出栈
    def pop(self) -> int:
        if self.size <= 0:
            raise RuntimeError('the stack is empty')
        res = self.data[self.size - 1]
        self.data = self.data[:self.size - 1]
        self.size -= 1
        return res


if __name__ == '__main__':
    stack = ArrayStack(10)
    stack.push(1)
    stack.push(6)
    stack.push(3)

    print(stack.pop())
    print(stack.pop())
    print(stack.pop())

    stack.push(10)
    print(stack.pop())
