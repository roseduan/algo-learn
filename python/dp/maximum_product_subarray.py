
# 乘积最大子数组
from typing import List


class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        res, maxim, minim = nums[0], nums[0], nums[0]
        for i in range(1, len(nums)):
            if nums[i] < 0:
                maxim, minim = minim, maxim
            maxim = max(nums[i], maxim * nums[i])
            minim = min(nums[i], minim * nums[i])
            res = max(maxim, res)
        return res
