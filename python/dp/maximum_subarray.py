
# 最大子序和
from typing import List


class Solution:
    def maxSubArray_1(self, nums: List[int]) -> int:
        for i in range(1, len(nums)):
            nums[i] = max(nums[i], nums[i] + nums[i - 1])
        return max(nums)

    def maxSubArray_2(self, nums: List[int]) -> int:
        res, maxim = nums[0], nums[0]
        for i in range(1, len(nums)):
            maxim = max(maxim + nums[i], nums[i])
            res = max(maxim, res)
        return res
