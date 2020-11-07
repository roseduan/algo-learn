
# 并查集的代码模板

class UnionFind:

    def __init__(self, n: int):
        self.count = 0
        self.parent = [i for i in range(n)]
    
    def find(self, p: int):
        while p != self.parent[p]:
            pass

    def union(self, p, q):
        pass