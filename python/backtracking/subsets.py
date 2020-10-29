from typing import List


# 子集

class Solution:

    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        self.helper(nums, 0, [], res)
        return res
    
    def helper(self, nums, k, data, res):
        res.append(data[:])
        for i in range(k, len(nums)):
            data.append(nums[i])
            self.helper(nums, i + 1, data, res)
            data.pop()
