from typing import List

# 有效的数独

class Solution:

    def isValidSudoku(self, board: List[List[str]]) -> bool:
        hor, ver, grid = [[False] * 9 for _ in range(9)], [[False] * 9 for _ in range(9)], [[False] * 9 for _ in range(9)]
        for i in range(9):
            for j in range(9):
                if board[i][j] != '.':
                    k = int(board[i][j]) - 1
                    grid_idx = (i // 3) * 3 + j // 3
                    if hor[i][k] or ver[j][k] or grid[grid_idx][k]:
                        return False
                    hor[i][k], ver[j][k], grid[grid_idx][k] = True, True, True
        return True
