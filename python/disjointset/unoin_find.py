
# 并查集的代码模板

class UnionFind:

    def __init__(self, n: int):
        self.count = n
        self.parent = [i for i in range(n)]
    
    def find(self, p: int):
        temp = p
        while p != self.parent[p]:
            p = self.parent[p]
        while temp != self.parent[p]:
            temp, self.parent[temp] = self.parent[temp], p
        return p

    def union(self, p, q):
        pSet, qSet = self.find(p), self.find(q)
        if self.parent[pSet] != qSet:
            self.parent[pSet] = qSet
            self.count -= 1
