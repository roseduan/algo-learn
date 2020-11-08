package datastructure.tree.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author roseduan
 * @time 2020/9/19 9:23 下午
 * @description 二叉树的最大深度
 */
public class MaximumDepthBinaryTree {

    /**
     * 第一种解法：使用递归，树的高度=max(左子树高度，右子树高度) + 1
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /**
     * 第二种解法，每一层进行统计，相当于二叉树的层次遍历
     */
    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node != null && node.left != null) {
                    queue.add(node.left);
                }
                if (node != null && node.right != null) {
                    queue.add(node.right);
                }
            }
            level++;
        }
        return level;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
