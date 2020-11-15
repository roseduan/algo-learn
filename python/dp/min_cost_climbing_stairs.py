from typing import List


# 使用最小花费爬楼梯

class Solution:

    def minCostClimbingStairs_1(self, cost: List[int]) -> int:
        dp = [0 for _ in range(len(cost))]
        dp[0], dp[1] = cost[0], cost[1]

        for i in range(2, len(cost)):
            dp[i] = min(dp[i - 1], dp[i - 2]) + cost[i]
        return min(dp[-1], dp[-2])

    def minCostClimbingStairs_2(self, cost: List[int]) -> int:
        prev, back = 0, 0
        for i in range(len(cost)):
            prev, back = back, min(prev, back) + cost[i]
        return min(prev, back)
        