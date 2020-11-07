# 最小栈

class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.data = []
        self.helper = []

    def push(self, x: int) -> None:
        self.data.append(x)
        if len(self.helper) > 0:
            x = min(x, self.helper[-1])
        self.helper.append(x)

    def pop(self) -> None:
        self.data.pop()
        self.helper.pop()

    def top(self) -> int:
        return self.data[-1]

    def getMin(self) -> int:
        return self.helper[-1]
