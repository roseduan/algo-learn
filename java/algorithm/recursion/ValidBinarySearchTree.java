package algorithm.recursion;

/**
 * @author roseduan
 * @time 2020/9/23 8:11 下午
 * @description 验证二叉搜索树
 */
public class ValidBinarySearchTree {

    /**
     * 根据二叉搜索树的特征，递归
     */
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }
        return helper(node.left, min, node.val) && helper(node.right, node.val, max);
    }

    /**
     * 中序遍历
     */
    private TreeNode prev = null;

    public boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (!isValidBST2(root.left)) {
            return false;
        }
        if (prev != null && prev.val >= root.val) {
            return false;
        }
        prev = root;
        return isValidBST2(root.right);
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
