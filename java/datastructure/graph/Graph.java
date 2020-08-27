package datastructure.graph;

import java.util.LinkedList;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/26 22:07
 * @description 图的一种简单实现
 */
public class Graph {

    private int vertex;
    private LinkedList<Integer>[] adj;

    @SuppressWarnings("unchecked")
    public Graph(int vertex){
        this.vertex = vertex;
        this.adj = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    /**
     * 添加边关系
     */
    public void addEdge(int s, int t){
        checkIndex(s, t);

        adj[s].add(t);
        adj[t].add(s);
    }

    /**
     * 删除边关系
     */
    public boolean removeEdge(int s, int t){
        checkIndex(s, t);

        adj[s].remove(t);
        adj[t].remove(s);
        return true;
    }

    /**
     * 一个顶点所有的边
     */
    public String listVertex(int s){
        if (s < 0 || s >= vertex){
            return null;
        }

        return adj[s].toString();
    }

    public int getVertex(){
        return this.vertex;
    }

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }

    private void checkIndex(int s, int t){
        boolean condition1 = s < 0 || t < 0;
        boolean condition2 = s >= vertex || t >= vertex;
        boolean condition3 = s == t;
        if (condition1 || condition2 || condition3){
            throw new IllegalArgumentException("Illegal index s : " + s + ", t : " + t);
        }
    }
}
