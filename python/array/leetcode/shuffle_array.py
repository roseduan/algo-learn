# 打乱数组
import random
from copy import copy
from typing import List


class Solution:

    def __init__(self, nums: List[int]):
        self.origin = copy(nums)
        self.nums = nums

    def reset(self) -> List[int]:
        return self.origin

    def shuffle(self) -> List[int]:
        for i in range(len(self.nums)):
            x = random.randint(0, len(self.nums) - 1)
            self.nums[i], self.nums[x] = self.nums[x], self.nums[i]
        return self.nums
