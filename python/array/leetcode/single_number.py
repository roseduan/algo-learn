
# 出现一次的数字
from typing import List


class Solution:

    # 使用排序
    def singleNumber_1(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        nums.sort()
        prev, back = 0, 1
        while back < len(nums) - 1:
            if nums[prev] != nums[back]:
                return nums[prev]
            else:
                prev, back = prev + 2, back + 2
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
