package datastructure.tree.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 路径总和
 */
public class PathSum {
    /**
     * 深度优先
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        int sub = targetSum - root.val;
        return hasPathSum(root.left, sub) || hasPathSum(root.right, sub);
    }

    /**
     * 广度优先
     */
    public boolean hasPathSum2(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        Queue<Integer> val = new LinkedList<>();
        val.add(root.val);
        while (!que.isEmpty()) {
            TreeNode node = que.poll();
            int i = val.poll();
            if (node.left == null && node.right == null) {
                if (targetSum == i) {
                    return true;
                }
            }
            if (node.left != null) {
                que.add(node.left);
                val.add(node.left.val + i);
            }
            if (node.right != null) {
                que.add(node.right);
                val.add(node.right.val + i);
            }
        }
        return false;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
