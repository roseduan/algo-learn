package datastructure.disjointset.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author roseduan
 * 朋友圈
 */
public class FriendCircles {
    
    /**
     * 深度优先搜索的思路
     */
    public int findCircleNum1(int[][] M) {
        boolean[] visited = new boolean[M.length];
        int res = 0;
        for (int i = 0; i < M.length; i++) {
            if (!visited[i]) {
                dfs(M, i, visited);
                res++;
            }
        }
        return res;
    }

    private void dfs(int[][] m, int i, boolean[] visited) {
        for (int j = 0; j < m.length; j++) {
            if (m[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(m, j, visited);
            }
        }
    }

    /**
     * 广度优先的思路
     */
    public int findCircleNum2(int[][] M) {
        boolean[] visited = new boolean[M.length];
        int res = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < M.length; i++) {
            if (!visited[i]) {
                queue.add(i);
                while (!queue.isEmpty()) {
                    int s = queue.poll();
                    visited[s] = true;
                    for (int j = 0; j < M.length; j++) {
                        if (M[s][j] == 1 && !visited[j]) {
                            queue.add(j);
                        }
                    }
                }
                res++;
            }
        }
        return res;
    }

    /**
     * 使用并查集解决
     */
    public int findCircleNum3(int[][] M) {
        int[] parent = new int[M.length];
        Arrays.fill(parent, -1);
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == 1 && i != j) {
                    union(parent, i, j);
                }
            }
        }

        int res = 0;
        for (int p : parent) {
            if (p != -1) {
                res++;
            }
        }
        return res;
    }

    private int find(int[] parent, int i) {
        if (parent[i] == -1) {
            return i;
        }
        return find(parent, parent[i]);
    }

    private void union(int[] parent, int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        if (xset != yset) {
            parent[xset] = yset;
        }
    }
}
