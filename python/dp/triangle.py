
# 三角形的最短路径和
import copy
from typing import List


class Solution:
    def minimumTotal_1(self, triangle: List[List[int]]) -> int:
        dp = copy.copy(triangle)
        for i in range(len(triangle) - 2, -1, -1):
            for j in range(len(triangle[i])):
                dp[i][j] = min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle[i][j]
        return dp[0][0]

    # 简化一维的写法
    def minimumTotal_2(self, triangle: List[List[int]]) -> int:
        dp = [0] * (len(triangle) + 1)
        for i in range(len(triangle) - 1, -1, -1):
            for j in range(len(triangle[i])):
                dp[j] = min(dp[j], dp[j + 1]) + triangle[i][j]
        return dp[0]

    # 复用自身，不新开数组
    def minimumTotal_3(self, triangle: List[List[int]]) -> int:
        for i in range(len(triangle) - 2, -1, -1):
            for j in range(len(triangle[i])):
                triangle[i][j] += min(triangle[i + 1][j + 1], triangle[i + 1][j])
        return triangle[0][0]
