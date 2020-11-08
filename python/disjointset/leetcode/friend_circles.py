from typing import List


# 朋友圈

class Solution:

    def findCircleNum_1(self, M: List[List[int]]) -> int:
        visited, res = [False] * len(M), 0
        for i in range(len(M)):
            if not visited[i]:
                self.dfs(M, i, visited)
                res += 1
        return res
    
    def dfs(self, M, i, visited):
        for j in range(len(M[i])):
            if not visited[j] and M[i][j] == 1:
                visited[j] = True
                self.dfs(M, j, visited)

    # 并查集
    def findCircleNum_2(self, M: List[List[int]]) -> int:
        parent, res = [i for i in range(len(M))], len(M)

        def find(p: int) -> int:
            while p != parent[p]:
                p = parent[p]
            return p
        
        def union(p:int, q:int):
            nonlocal res
            pSet, qSet = find(p), find(q)
            if parent[pSet] != qSet:
                parent[pSet] = qSet
                res -= 1

        for i in range(len(M)):
            for j in range(i + 1, len(M[i])):
                if M[i][j] == 1:
                    union(i, j)
        return res
        