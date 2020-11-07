from typing import List

# 被围绕的区域


class Solution:

    # 深度优先搜索
    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        for i in range(1, len(board) - 1):
            for j in range(1, len(board[i]) - 1):
                if board[i][j] == 'O':
                    pass

    def dfs(self, board, i, j):
        if board[i - 1][j] == 'O' and i - 1 == 0:
            return
        if board[i][j - 1] == 'O' and j - 1 == 0:
            return
        if board[i + 1][j] == 'O' and i + 1 == len(board) - 1:
            return
        if board[i][j + 1] == 'O' and j + 1 == len(board[i]) - 1:
            return
        