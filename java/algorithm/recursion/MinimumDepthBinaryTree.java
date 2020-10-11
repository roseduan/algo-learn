package algorithm.recursion;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author roseduan
 * @time 2020/9/24 7:48 下午
 * @description 二叉树的最小深度
 */
public class MinimumDepthBinaryTree {

    /**
     * 递归，深度优先遍历的思想
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int res = Integer.MAX_VALUE;
        if (root.left != null) {
            res = Math.min(minDepth(root.left), res);
        }
        if (root.right != null) {
            res = Math.min(minDepth(root.right), res);
        }
        return res + 1;
    }

    /**
     * 广度优先遍历
     */
    public int minDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            level++;
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return level;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return -1;
    }

    public static class TreeNode {
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
