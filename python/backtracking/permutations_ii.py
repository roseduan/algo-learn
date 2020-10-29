from typing import List


# 全排列II

class Solution:

    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res, visited = [], [False] * len(nums)
        self.helper(nums, visited, [], res)
        return res

    
    def helper(self, nums, visited, data, res):
        if len(data) == len(nums):
            res.append(data[:])
            return

        for i in range(len(nums)):
            if (i > 0 and nums[i] == nums[i - 1] and not visited[i - 1]) or visited[i]:
                continue
            visited[i] = True
            data.append(nums[i])
            self.helper(nums, visited, data, res)
            data.pop()
            visited[i] = False


if __name__ == "__main__":
    print(1)