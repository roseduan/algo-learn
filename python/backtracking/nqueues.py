from typing import List


# N皇后

class Solution:

    def __init__(self):
        self.shu = set()
        self.pie = set()
        self.na = set()

    def solveNQueens(self, n: int) -> List[List[str]]:
        res = []
        self.helper(n, 0, [], res)
        return res

    def helper(self, n, row, data, res):
        if row == n:
            temp = []
            board = [['.'] * n for _ in range(n)]
            for x, y in data:
                board[x][y] = 'Q'
                temp.append(''.join(board[x]))
            res.append(temp)
            return
        
        for col in range(n):
            if col in self.shu or col + row in self.pie or col - row in self.na:
                continue
            self.shu.add(col)
            self.pie.add(col + row)
            self.na.add(col - row)

            data.append((row, col))
            self.helper(n, row + 1, data, res)
            data.pop()
            
            self.shu.remove(col)
            self.pie.remove(col + row)
            self.na.remove(col - row)
            