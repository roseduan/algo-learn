# 剑指offer：找到数组中重复的数字
from typing import List


class Solution:

    # 排序之后遍历查找
    def findRepeatNumber_1(self, nums: List[int]) -> int:
        nums.sort()
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                return nums[i]
        return -1

    # 使用一个哈希表
    def findRepeatNumber_2(self, nums: List[int]) -> int:
        m = set()
        for n in nums:
            if n in m:
                return n
            m.add(n)
        return -1

    # 原地解决
    def findRepeatNumber_3(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            while i != nums[i]:
                if nums[i] == nums[nums[i]]:
                    return nums[i]
                temp = nums[i]
                nums[i], nums[temp] = nums[temp], nums[i]
