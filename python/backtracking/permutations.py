from typing import List


# 全排列

class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        self.helper(nums, [], res)
        return res

    def helper(self, nums, data, res):
        if len(data) == len(nums):
            res.append(data[:])
            return
        
        for n in nums:
            if n not in data:
                data.append(n)
                self.helper(nums, data, res)
                data.pop()
