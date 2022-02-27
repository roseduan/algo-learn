package datastructure.tree.leetcode;

/**
 * @author roseduan
 * @time 2022/2/27 9:53 上午
 * @description 二叉树的最近公共祖先
 */

public class LowestCommonAncestorBinaryTree {

    /**
     * 如果root为空，或者p q任意一个等于root，直接返回root
     * 分别遍历左右节点
     * 如果左右节点都不为空，则说明root就是最近的公共祖先
     * 如果有任意一个不为空，则直接返回
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null ||root == p || root == q) {
            return root;
        }
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        if (l != null && r != null) {
            return root;
        }
        return l == null ? r : l;
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
