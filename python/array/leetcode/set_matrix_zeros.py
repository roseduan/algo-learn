# 矩阵置零
from typing import List


class Solution:

    # 记录0出现的位置，然后再置为0
    def setZeroes_1(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        hor, ver = set(), set()
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][j] == 0:
                    hor.add(i), ver.add(j)
        for i in hor:
            matrix[i] = [0] * len(matrix[0])
        for i in ver:
            for j in range(len(matrix)):
                matrix[j][i] = 0
