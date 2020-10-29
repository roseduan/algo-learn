from typing import List
import sys


# 买卖股票的最佳时机I

class Solution:

    # 暴力法，运行会超时
    def maxProfit_1(self, prices: List[int]) -> int:
        profit = 0
        for i in range(len(prices) - 1):
            for j in range(i + 1, len(prices)):
                profit = max(profit, prices[j] - prices[i])
        return profit


    def maxProfit_2(self, prices: List[int]) -> int:
        profit, minmum = 0, sys.maxsize
        for i in prices:
            if i < minmum:
                minmum = i
            profit = max(profit, i - minmum)
        return profit
        