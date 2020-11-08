package datastructure.tree.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author roseduan
 * @time 2020/9/15 10:16 下午
 * @description N叉树的后序遍历
 */
public class NaryTreePostorderTraversal {

    private final List<Integer> res = new ArrayList<>();

    /**
     * 递归
     */
    public List<Integer> postorder(Node root) {
        if (root == null) {
            return res;
        }

        List<Node> children = root.children;
        if (!children.isEmpty()) {
            for (Node node : children) {
                postorder(node);
            }
        }
        res.add(root.val);
        return res;
    }

    /**
     * 迭代
     */
    public List<Integer> postorder2(Node root) {
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node node = stack.pop();
            list.addFirst(node.val);
            List<Node> children = node.children;
            if (children != null) {
                for (Node child : children) {
                    stack.push(child);
                }
            }
        }
        return list;
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
