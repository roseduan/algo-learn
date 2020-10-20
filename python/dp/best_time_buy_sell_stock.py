
# 买卖股票的最佳时机I
from typing import List


class Solution:
    # 暴力法，两层for循环遍历
    def maxProfit_1(self, prices: List[int]) -> int:
        profit = 0
        for i in range(len(prices) - 1):
            for j in range(i + 1, len(prices)):
                if prices[j] - prices[i] > profit:
                    profit = prices[j] - prices[i]
        return profit

    def maxProfit_2(self, prices: List[int]) -> int:
        if len(prices) == 0:
            return 0
        profit, minim = 0, prices[0]
        for i in range(1, len(prices)):
            if prices[i] < minim:
                minim = prices[i]
            profit = max(profit, prices[i] - minim)
        return profit
