from typing import List


# 三数之和


class Solution:

    # 暴力法，三层循环
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        for i in range(len(nums) - 2):
            for j in range(len(nums) - 1):
                for k in range(len(nums)):
                    if nums[i] + nums[j] == -nums[k]:
                        res.append([nums[i], nums[j], nums[k]])
        return res
        