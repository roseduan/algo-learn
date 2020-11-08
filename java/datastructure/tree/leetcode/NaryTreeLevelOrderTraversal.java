package datastructure.tree.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author roseduan
 * @time 2020/9/19 11:20 上午
 * @description N叉树的层次遍历
 */
public class NaryTreeLevelOrderTraversal {

    /**
     * 广度优先的思想处理
     */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int head = 0, tail = 1;
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            List<Node> children = node.children;
            if (children != null) {
                queue.addAll(children);
            }

            list.add(node.val);
            if (++head == tail) {
                res.add(new ArrayList<>(list));
                head = 0;
                tail = queue.size();
                list.clear();
            }
        }
        return res;
    }

    /**
     * 高票答案，代码更加简洁，我来品一品
     */
    public List<List<Integer>> levelOrder1(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> curLevel = new LinkedList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Node cur = queue.poll();
                curLevel.add(cur.val);
                for (Node child : cur.children) {
                    queue.offer(child);
                }
            }
            res.add(curLevel);
        }
        return res;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
