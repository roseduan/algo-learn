
# 打家劫舍
from typing import List


class Solution:
    def rob_1(self, nums: List[int]) -> int:
        n = len(nums)
        if n <= 1:
            return 0 if n == 0 else nums[0]
        dp = [nums[0]] + [max(nums[0], nums[1])] + [0] * (n - 2)
        for i in range(2, n):
            dp[i] = max(dp[i - 1], nums[i] + dp[i - 2])
        return dp[-1]

    def rob_2(self, nums: List[int]) -> int:
        prev, back = 0, 0
        for i in nums:
            prev, back = back, max(i + prev, back)
        return back
