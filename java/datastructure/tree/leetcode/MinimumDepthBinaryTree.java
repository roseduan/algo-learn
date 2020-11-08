package datastructure.tree.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author roseduan
 * @time 2020/9/26 8:10 下午
 * @description 二叉树的最小深度
 */
public class MinimumDepthBinaryTree {

    /**
     * 递归
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
     * 更加简洁的一种写法
     */
    public int minDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = minDepth2(root.left);
        int right = minDepth2(root.right);
        //如果left和right中有一个为0，则说明有一个子树为空，则只管另一个子树的结果即可
        return left == 0 || right == 0 ? left + right + 1 : Math.min(left, right) + 1;
    }

    /**
     * 广度优先搜索的方式解决
     */
    public int minDepth3(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int min = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            min++;
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return min;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return min;
    }

    public static class TreeNode {
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
