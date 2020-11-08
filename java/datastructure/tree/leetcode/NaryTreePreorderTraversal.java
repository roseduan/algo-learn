package datastructure.tree.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author roseduan
 * @time 2020/9/19 10:52 上午
 * @description N叉树的前序遍历
 */
public class NaryTreePreorderTraversal {

    public static void main(String[] args) {
        String s = "ANNS";
        s.toLowerCase();
    }

    /**
     * 递归
     */
    private final List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return res;
        }

        res.add(root.val);
        List<Node> children = root.children;
        if (children != null) {
            for (Node node : children) {
                preorder(node);
            }
        }
        return res;
    }

    /**
     * 迭代
     */
    public List<Integer> preorder2(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node node = stack.pop();
            list.add(node.val);
            List<Node> children = node.children;
            if (children != null) {
                Collections.reverse(children);
                for (Node child : children) {
                    stack.push(child);
                }
            }
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
