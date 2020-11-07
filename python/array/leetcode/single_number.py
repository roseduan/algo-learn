
# 出现一次的数字
from typing import List


class Solution:

    # 使用排序
    def singleNumber_1(self, nums: List[int]) -> int:
        nums.sort()
        for i in range(0, len(nums) - 1, 2):
            if nums[i] != nums[i + 1]:
                return nums[i]
        return nums[-1]

    # 使用一个set
    def singleNumber_2(self, nums: List[int]) -> int:
        s = set()
        for i in nums:
            if i in s:
                s.remove(i)
            else:
                s.add(i)
        return s.pop()
