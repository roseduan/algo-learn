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
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        parent[rootP] = rootQ;
        this.count--;
    }
}
