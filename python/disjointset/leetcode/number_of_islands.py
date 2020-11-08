from typing import List

# 岛屿数量


class Solution:

    # 深度优先搜索
    def numIslands_1(self, grid: List[List[str]]) -> int:
        res = 0
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if grid[i][j] == '1':
                    self.dfs(grid, i, j)
                    res += 1
        return res
    
    def dfs(self, grid, i, j):
        if i < 0 or j < 0 or i >= len(grid) or j >= len(grid[i]):
            return
        if grid[i][j] == '0':
            return
        
        grid[i][j] = '0'
        self.dfs(grid, i + 1, j)
        self.dfs(grid, i, j + 1)
        self.dfs(grid, i - 1, j)
        self.dfs(grid, i, j - 1)

    # 广度优先搜索
    def numIslands_2(self, grid: List[List[str]]) -> int:
        res, queue = 0, []
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if grid[i][j] == '1':
                    queue.append([i, j])
                    while len(queue) > 0:
                        x, y = queue[0][0], queue[0][1]
                        queue = queue[1:]

                        if x > 0 and grid[x - 1][y] == '1':
                            grid[x - 1][y] = '0'
                            queue.append([x - 1, y])
                        
                        if x < len(grid) - 1 and grid[x + 1][y] == '1':
                            grid[x + 1][y] = '0'
                            queue.append([x + 1, y])
                        
                        if y > 0 and grid[x][y - 1] == '1':
                            grid[x][y - 1] = '0'
                            queue.append([x, y - 1])
                        
                        if y < len(grid[x]) - 1 and grid[x][y + 1] == '1':
                            grid[x][y + 1] = '0'
                            queue.append([x, y + 1])
                    res += 1
        return res

    # 并查集
    def numIslands_3(self, grid: List[List[str]]) -> int:
        pass