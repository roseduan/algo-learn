package datastructure.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/9 22:45
 * @description 求二叉树的高度
 */
public class TreeHeight {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * 按层遍历法
     */
    private int solution1(TreeNode root){
        if (root == null){
            return 0;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int head = 0;
        int tail = queue.size();
        int level = 0;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.right != null){
                queue.add(node.right);
            }
            if (node.left != null){
                queue.add(node.left);
            }

            if (++head == tail){
                head = 0;
                tail = queue.size();
                level++;
            }
        }

        return level;
    }

    /**
     * 递归法
     */
    private int solution2(TreeNode root){
        if (root == null){
            return 0;
        }

        return Math.max(solution2(root.left), solution2(root.right)) + 1;
    }
}
