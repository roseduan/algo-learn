
# N皇后问题II

class Solution:

    shu, pie, na = set(), set(), set()
    res = 0

    # 传统的解法
    def totalNQueens1(self, n: int) -> int:
        self.dfs(n, 0)
        return self.res

    def dfs(self, n, i):
        if i == n:
            self.res += 1
            return
        
        for j in range(n):
            if j not in self.shu and i - j not in self.pie and i + j not in self.na:
                self.shu.add(j), self.pie.add(i - j), self.na.add(i + j)
                self.dfs(n, i + 1)
                self.shu.remove(j), self.pie.remove(i - j), self.na.remove(i + j)


    # 使用位运算
    def totalNQueens2(self, n: int) -> int:
        self.count = 0

    def dfs2(self, n, row, shu, pie, na):
        if row == n:
            self.count += 1
            return
        