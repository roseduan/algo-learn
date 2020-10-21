package datastructure.tree.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的锯齿形遍历
 */
public class ZigZagLevelOrderTraversal {

    /**
     * 广度优先搜索
     */
    public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            level++;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (level % 2 == 0) {
                    list.add(0, node.val);
                } else {
                    list.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }

    /**
     * 再来用深度优先搜索搞一搞
     */
    public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, 0, res);
        return res;
    }

    private void dfs(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }

        if (level == res.size()) {
            res.add(new ArrayList<>());
        }
        if (level % 2 == 0) {
            res.get(level).add(root.val);
        } else {
            res.get(level).add(0, root.val);
        }
        dfs(root.left, level + 1, res);
        dfs(root.right, level + 1, res);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
