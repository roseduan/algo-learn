
import random

class RandomizedSet:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.dic = {}
        self.lis = []

    def insert(self, val: int) -> bool:
        """
        Inserts a value to the set. Returns true if the set did not already contain the specified element.
        """
        if val in self.dic:
            return False
        self.lis.append(val)
        self.dic[val] = len(self.lis) - 1
        return True

    def remove(self, val: int) -> bool:
        """
        Removes a value from the set. Returns true if the set contained the specified element.
        """
        if val not in self.dic:
            return False
            
        last, idx = self.lis[-1], self.dic[val]
        self.lis[idx], self.dic[last] = last, idx
        self.lis = self.lis[:-1]
        self.dic.pop(val)
        return True

    def getRandom(self) -> int:
        """
        Get a random element from the set.
        """
        return random.choice(self.lis)
