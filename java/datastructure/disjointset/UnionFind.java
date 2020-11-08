package datastructure.disjointset;

/**
 * @author roseduan
 * 并查集的代码模板
 */
public class UnionFind {
    /**
     * 表示有多少个独立的集合
     */
    private int count;
    private final int[] parent;

    public UnionFind(int n) {
        this.count = n;
        this.parent = new int[n];
        for (int i = 0; i < n; i++) {
            this.parent[i] = i;
        }
    }

    public int find(int p) {
        int res = p;
        while (res != parent[res]) {
            res = parent[res];
        }

        //路径压缩
        while (p != parent[p]) {
            int temp = parent[p];
            parent[p] = res;
            p = temp;
        }
        return res;
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP != rootQ) {
            parent[rootP] = rootQ;
            this.count--;
        }
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
}
