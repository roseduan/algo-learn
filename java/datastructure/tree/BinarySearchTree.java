package datastructure.tree;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/11/30 14:18
 * @description 二叉搜索树实现
 */
public class BinarySearchTree {

    private Node head;

    private static class Node{
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * 查找
     */
    public Node find(int value) {
        Node p = head;

        while (p != null && p.val != value){
            if (p.val > value){
                p = p.left;
            }
            else {
                p = p.right;
            }
        }
        return p;
    }

    /**
     * 查找（递归实现）
     */
    public Node find(Node p, int value){
        if (p == null){
            return null;
        }

        if (p.val > value){
            return find(p.left, value);
        }
        else if (p.val < value){
            return find(p.right, value);
        }
        else {
            return p;
        }
    }

    /**
     * 插入
     */
    public void add(int value){
        Node node = new Node(value);

        if (head == null){
            head = node;
            return;
        }

        Node p = head;
        while (true){
            if (p.val > value){
                if (p.left == null){
                    p.left = node;
                    return;
                }
                p = p.left;
            }
            else {
                if (p.right == null){
                    p.right = node;
                    return;
                }
                p = p.right;
            }
        }
    }

    /**
     * 插入（递归实现）
     */
    public void add(Node p, Node node){
        if (p == null){
            p = node;
            return;
        }

        if (p.val > node.val){
            if (p.left == null){
                p.left = node;
                return;
            }
            add(p.left, node);
        }
        else {
            if (p.right == null){
                p.right = node;
                return;
            }
            add(p.right, node);
        }
    }

    /**
     * 删除
     */
    public boolean remove(int value){
        Node p = head;
        Node parent = null;

        while (p != null && p.val != value){
            parent = p;
            if (p.val > value){
                p = p.left;
            } else{
                p = p.right;
            }
        }
        if (p == null){
            return false;
        }

        if (p.left != null && p.right != null){
            Node min = p.right;
            Node minParent = p;
            while (min.left != null){
                minParent = min;
                min = min.left;
            }

            p.val = min.val;
            p = min;
            parent = minParent;
        }

        Node child;
        if (p.left != null){
            child = p.left;
        }else if (p.right != null){
            child = p.right;
        }else {
            child = null;
        }

        if (parent == null){
            head = child;
        }else if (parent.left == p){
            parent.left = child;
        }else {
            parent.right = child;
        }
        return true;
    }
}
