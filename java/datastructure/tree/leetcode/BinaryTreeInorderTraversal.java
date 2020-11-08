package datastructure.tree.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author roseduan
 * @time 2020/9/14 10:03 下午
 * @description 二叉树的中序遍历
 */
public class BinaryTreeInorderTraversal {

    private final List<Integer> res = new ArrayList<>();

    /**
     * 递归的方式
     * 运行结果：通过，速度击败 100%
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return res;
        }
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return res;
    }

    /**
     * 迭代的方式，使用一个栈，手动实现递归的效果
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
