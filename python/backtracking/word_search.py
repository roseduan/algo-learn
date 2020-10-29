from typing import List

# 单词搜索


class Solution:

    def exist(self, board: List[List[str]], word: str) -> bool:
        visited = [[False] * len(board[0]) for _ in range(len(board))]
        for i in range(len(board)):
            for j in range(len(board[i])):
                if self.helper(board, word, visited, i, j, 0):
                    return True
        return False

    def helper(self, board, word, visited, i, j, k) -> bool:
        if k == len(word):
            return True
        if i < 0 or j < 0 or i >= len(board) or j >= len(board[0]):
            return False
        if board[i][j] != word[k] or visited[i][j]:
            return False

        visited[i][j] = True
        for x, y in [(0, 1), (1, 0), (0, -1), (-1, 0)]:
            if self.helper(board, word, visited, i + x, j + y, k + 1):
                return True
        visited[i][j] = False
        return False
