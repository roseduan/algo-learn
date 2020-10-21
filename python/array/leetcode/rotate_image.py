# 旋转图像
from typing import List


class Solution:

    # 借助一个额外的数组来处理
    def rotate_1(self, matrix: List[List[int]]) -> None:
        res = []
        for i in range(len(matrix[0])):
            temp = []
            for j in range(len(matrix) - 1, -1, -1):
                temp.append(matrix[j][i])
            res.append(temp)
        matrix[:] = res[:]

    # 先整体翻转数组，然后再对称交换
    # first reverse up to down, then swap the symmetry
    # 1 2 3     7 8 9     7 4 1
    # 4 5 6  => 4 5 6  => 8 5 2
    # 7 8 9     1 2 3     9 6 3
    def rotate_2(self, matrix: List[List[int]]) -> None:
        matrix.reverse()
        for i in range(len(matrix)):
            for j in range(i + 1, len(matrix[i])):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
