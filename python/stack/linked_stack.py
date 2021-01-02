
# 使用链表实现的栈

class ListNode:

    def __init__(self, val: int):
        self.val = val
        self.next = None


class LinkedStack:

    def __init__(self, capacity: int):
        self.head = None
        self.size = 0
        self.capacity = capacity

    # 入栈
    def push(self, val: int):
        if self.size >= self.capacity:
            raise RuntimeError('the stack is full')

        node = ListNode(val)
        if self.head:
            node.next = self.head
        self.head = node
        self.size += 1

    # 出栈
    def pop(self):
        if self.size <= 0:
            raise RuntimeError('the stack is empty')

        res = self.head.val
        self.head = self.head.next
        self.size -= 1
        return res


if __name__ == '__main__':
    stack = LinkedStack(10)
    stack.push(1)
    stack.push(5)
    stack.push(8)

    print(stack.pop())
    print(stack.pop())
    print(stack.pop())

    stack.push(10)
    stack.push(21)

    print(stack.pop())
