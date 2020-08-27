package algorithm.graphAlgo;

import datastructure.graph.Graph;

import java.util.LinkedList;

/**
 * @author roseduan
 * @time 2019/7/4 16:38
 * @description 深度优先搜索，回溯思想
 */
public class DepthFirstSearch {

    private static boolean found = false;

    public static void dfs(Graph graph, int s, int t){
        int vertex = graph.getVertex();
        LinkedList<Integer>[] list = graph.getAdj();
        if (s == t || s >= vertex || t >= vertex){
            return;
        }

        boolean[] visited = new boolean[vertex];
        int[] prev = new int[vertex];
        for (int i = 0; i < vertex; i ++) {
            prev[i] = -1;
        }

        recurDfs(s, t, visited, prev, list);
        print(prev, s, t);
    }

    private static void recurDfs(int w, int t, boolean[] visited, int[] prev, LinkedList<Integer>[] list){
        if (found){
            return;
        }
        visited[w] = true;
        if (w == t){
            found = true;
            return;
        }
        for (int i = 0; i < list[w].size(); i ++) {
            int q = list[w].get(i);
            if (!visited[q]){
                prev[q] = w;
                recurDfs(q, t, visited, prev, list);
            }
        }
    }

    /**
     * 递归打印 s -> t 的路径
     */
    private static void print(int[] prev, int s, int t){
        if (prev[t] != -1 && t != s){
            print(prev, s, prev[t]);
        }
        System.out.print(t + " ");
    }

}
