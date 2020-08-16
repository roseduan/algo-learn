package datastructure.tree;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/11/25 21:36
 * @description 二叉树的三种遍历
 */
public class BinarySearchTreeTraversal {

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
     * 前序遍历
     */
    public void preTraversal(TreeNode head){
        if (head == null){
            return;
        }

        System.out.print(head.val + " ");
        preTraversal(head.left);
        preTraversal(head.right);
    }

    /**
     * 中序遍历
     */
    public void midTraversal(TreeNode head){
        if (head == null){
            return;
        }

        midTraversal(head.left);
        System.out.print(head.val + " ");
        midTraversal(head.right);
    }

    /**
     * 后序遍历
     */
    public void postTraversal(TreeNode head){
        if (head == null){
            return;
        }

        postTraversal(head.left);
        postTraversal(head.right);
        System.out.print(head.val + " ");
    }
}
