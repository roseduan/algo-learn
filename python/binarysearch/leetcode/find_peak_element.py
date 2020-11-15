from typing import List


# 寻找峰值

class Solution:

    # 暴力法，线性查找
    def findPeakElement_1(self, nums: List[int]) -> int:
        for i in range(1, len(nums) - 1):
            if nums[i - 1] < nums[i] > nums[i + 1]:
                return i
        return 0
