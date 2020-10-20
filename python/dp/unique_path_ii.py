# 不同路径II
from typing import List


class Solution:

    # 分治思想，递归解决
    def uniquePathsWithObstacles_1(self, obstacleGrid: List[List[int]]) -> int:
        def helper(val: List[List[int]], i, j) -> int:
            if val[i][j] == 1:
                return 0
            if i == len(val) - 1 and j == len(val[0]) - 1:
                return 1
            x, y = 0, 0
            if i < len(val) - 1:
                x = helper(val, i + 1, j)
            if j < len(val[0]) - 1:
                y = helper(val, i, j + 1)
            return x + y

        return helper(obstacleGrid, 0, 0)

    # 动态规划的思想
    def uniquePathsWithObstacles_2(self, obstacleGrid: List[List[int]]) -> int:
        m, n = len(obstacleGrid), len(obstacleGrid[0])
        dp = [[0 for _ in range(n)] for _ in range(m)]
        for i in range(0, m):
            for j in range(0, n):
                if i == 0:
                    if j > 0 and dp[i][j - 1] == 0:
                        dp[i][j] = 0
                    else:
                        dp[i][j] = 1 if obstacleGrid[i][j] == 0 else 0
                elif j == 0:
                    if i > 0 and dp[i - 1][j] == 0:
                        dp[i][j] = 0
                    else:
                        dp[i][j] = 1 if obstacleGrid[i][j] == 0 else 0
                elif obstacleGrid[i][j] == 0:
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        return dp[-1][-1]

    # 简化一维的写法
    def uniquePathsWithObstacles_3(self, obstacleGrid: List[List[int]]) -> int:
        dp = [1] + [0] * (len(obstacleGrid[0]))
        for row in obstacleGrid:
            for i in range(len(row)):
                dp[i] = 0 if row[i] else dp[i] + dp[i - 1]
        return dp[-2]
