
# 动态数组的实现
class Array:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.data = []

    def find(self, idx: int):
        if idx >= len(self.data):
            raise IndexError("invalid key {}".format(idx))
        return self.data[idx]

    def add(self, val) -> bool:
        if len(self.data) == self.capacity:
            return False
        self.data.append(val)
        return True

    def set(self, idx: int, val):
        self.data.insert(idx, val)

    def delete(self, idx: int):
        if idx >= len(self.data):
            raise IndexError("invalid key {}".format(idx))
        self.data.pop(idx)

    def size(self) -> int:
        return len(self.data)

    def print(self):
        for n in self.data:
            print(n, end=" ")

    def __iter__(self):
        for item in self.data:
            yield item

    def __getitem__(self, item):
        return self.data[item]
