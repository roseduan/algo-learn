
# 设计循环双端队列

class MyCircularDeque:

    def __init__(self, k: int):
        """
        Initialize your data structure here. Set the size of the deque to be k.
        """
        self.data = []
        self.size = 0
        self.capacity = k
        self.head = 0
        self.tail = 0

    def insertFront(self, value: int) -> bool:
        """
        Adds an item at the front of Deque. Return true if the operation is successful.
        """
        if self.isFull():
            return False

        if self.size == 0 and self.head == 0:
            pass

    def insertLast(self, value: int) -> bool:
        """
        Adds an item at the rear of Deque. Return true if the operation is successful.
        """

    def deleteFront(self) -> bool:
        """
        Deletes an item from the front of Deque. Return true if the operation is successful.
        """

    def deleteLast(self) -> bool:
        """
        Deletes an item from the rear of Deque. Return true if the operation is successful.
        """

    def getFront(self) -> int:
        """
        Get the front item from the deque.
        """

    def getRear(self) -> int:
        """
        Get the last item from the deque.
        """

    def isEmpty(self) -> bool:
        """
        Checks whether the circular deque is empty or not.
        """

    def isFull(self) -> bool:
        """
        Checks whether the circular deque is full or not.
        """


if __name__ == '__main__':
    data = []
    print(1 % 10)
    data[0] = 120
    print(data)
