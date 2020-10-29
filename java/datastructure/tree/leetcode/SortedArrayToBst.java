package datastructure.tree.leetcode;

/**
 * @author roseduan
 * 将有序数组转换为二叉搜索树
 */
public class SortedArrayToBst {

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int i, int j) {
        if (i > j) {
            return null;
        }

        int mid = (i + j) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, i, mid - 1);
        root.right = helper(nums, mid + 1, j);
        return root;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
