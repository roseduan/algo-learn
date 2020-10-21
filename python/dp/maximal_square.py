
# 最大正方形
# https://leetcode-cn.com/problems/maximal-square
from typing import List


class Solution:
    def maximalSquare(self, matrix: List[List[str]]) -> int:
        if not matrix or len(matrix) == 0:
            return 0
        dp, res = [[0 for _ in range(len(matrix[0]))] for _ in range(len(matrix))], 0
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][j] == '1':
                    if i == 0 or j == 0:
                        dp[i][j] = 1
                    else:
                        dp[i][j] = 1 + min(dp[i - 1][j - 1], min(dp[i - 1][j], dp[i][j - 1]))
                res = max(res, dp[i][j])
        return res * res
