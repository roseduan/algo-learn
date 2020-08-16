package algorithm.graphAlgo;

import datastructure.graph.Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author roseduan
 * @time 2019/7/4 15:23
 * @description 广度优先搜索
 */
public class BreadthFirstSearch {

    public static void bfs(Graph graph, int s, int t){
        int vertex = graph.getVertex();
        LinkedList<Integer>[] list = graph.getAdj();
        if (s == t || s >= vertex || t >= vertex){
            return;
        }

        boolean[] visited = new boolean[vertex];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        int[] prev = new int[vertex];
        for (int i = 0; i < vertex; i ++) {
            prev[i] = -1;
        }

        while (queue.size() != 0){
            int w = queue.poll();
            for (int i = 0; i < list[w].size(); i++) {
                int q = list[w].get(i);
                if (!visited[q]){
                    prev[q] = w;
                    //查找到了
                    if (q == t){
                        print(prev, s, t);
                        return;
                    }
                    visited[q] = true;
                    queue.add(q);
                }
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
