
# 使用队列实现一个栈

class MyStack:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.input = []

    def push(self, x: int) -> None:
        """
        Push element x onto stack.
        """
        self.input.append(x)
        if len(self.input) > 0:
            self.input = [x] + self.input[:len(self.input) - 1]

    def pop(self) -> int:
        """
        Removes the element on top of the stack and returns that element.
        """
        return self.input.pop(0)

    def top(self) -> int:
        """
        Get the top element.
        """
        return self.input[0]


    def empty(self) -> bool:
        """
        Returns whether the stack is empty.
        """
        return len(self.input) == 0
