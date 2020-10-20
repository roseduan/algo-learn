
# 零钱兑换
from typing import List


class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = [0] + [amount + 1] * amount
        for i in range(1, amount + 1):
            for c in coins:
                if c <= i:
                    dp[i] = min(dp[i], dp[i - c] + 1)
        return -1 if dp[amount] > amount else dp[amount]
