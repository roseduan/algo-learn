package datastructure.tree;

/**
 * @author Rose_Duan
 */
public class RedBlackTree<K extends Comparable<K>,V> {

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private Node root;
    private int size;

    public RedBlackTree() {
        root = null;
        size = 0;
    }

    /**
     * 左旋转
     */
    //   node                     x
    //  /   \     左旋转         /  \
    // T1   x   --------->   node   T3
    //     / \              /   \
    //    T2 T3            T1   T2
    private Node leftRotate(Node node){
        Node x = node.right;
        //左旋转操作
        node.right = x.left;
        x.left = node;
        x.color = node.color;
        node.color = RED;
        return x;
    }

    /**
     * 颜色翻转
     */
    private void flipColors(Node node){
        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;
    }

    /**
     * 右旋转
     */
    //     node                   x
    //    /   \     右旋转       /  \
    //   x    T2   ------->   y   node
    //  / \                       /  \
    // y  T1                     T1  T2
    private Node rightRotate(Node node){
        Node x = node.left;

        //右旋转操作
        node.left = x.right;
        x.right = node;
        x.color = node.color;
        node.color = RED;

        return x;
    }

    /**
     * 判断当前节点是否为红色
     */
    public boolean isRed(Node node) {
        if(node == null){
            return BLACK;
        }
        return node.color;
    }

    /**
     * 向红黑树中插入元素
     */
    public void add(K key, V value) {
        root = add(root,key,value);
        root.color = BLACK;//根节点为黑色节点
    }

    /**
     * 向node为根元素的红黑树中插入元素
     * 递归算法
     */
    private Node add(Node node, K key, V value){
        //递归终止条件，返回结果为null
        if(node == null){
            size ++;
            return new Node(key,value);
        }

        if(key.compareTo(node.key) < 0){
            node.left = add(node.left,key,value);
        }else if(key.compareTo(node.key) > 0){
            node.right = add(node.right,key,value);
        }else {
            node.value = value;
        }

        /*==========维护红黑树性质 Start==========*/

        //判断是否需要左旋转
        if(isRed(node.right) && !isRed(node.left)){
            node = leftRotate(node);
        }

        //判断是否需要右旋转
        if(isRed(node.left) && isRed(node.left.left)){
            node = rightRotate(node);
        }

        //判断是否需要颜色翻转
        if(isRed(node.left) && isRed(node.right)){
            flipColors(node);
        }
        /*==========维护红黑树性质 End==========*/
        return node;
    }

    /**
     * 查找红黑树的最小值
     */
    public V minimum(){
        if(isEmpty()){
            throw new IllegalArgumentException("BinarySearchTree is empty !");
        }
        return minimum(root).value;
    }

    /**
     * 查找以node为根节点红黑树的最小节点
     * 深度优先遍历，递归实现
     */
    private Node minimum(Node node) {
        if(isEmpty()){
            throw new IllegalArgumentException("BinarySearchTree is empty !");
        }
        if(node.left == null){
            return node;
        }
        return minimum(node.left);
    }

    /**
     * 查找红黑树的最大值
     */
    public V maximize(){
        if(isEmpty()){
            throw new IllegalArgumentException("BinarySearchTree is empty !");
        }
        return maximize(root).value;
    }

    /**
     * 查找以node为根节点红黑树的最大节点
     * 深度优先遍历，递归实现
     */
    private Node maximize(Node node) {
        if(isEmpty()){
            throw new IllegalArgumentException("BinarySearchTree is empty !");
        }
        if(node.right == null){
            return node;
        }
        return minimum(node.right);
    }

    /**
     * 删除红黑树的最大值
     */
    public V removeMax(){
        V maximize = maximize();
        removeMax(root);
        return maximize;
    }

    /**
     * 删除以node为根的红黑树的最大节点
     * 深度优先遍历，递归实现
     */
    private Node removeMax(Node node){
        if(node.right == null){
            Node leftNode = node.left;
            node.left = null;
            size --;
            return leftNode;
        }
        node.right = removeMin(node.right);
        return node;
    }

    /**
     * 删除红黑树的最小值
     */
    public V removeMin(){
        V minimum = minimum();
        removeMin(root);
        return minimum;
    }

    /**
     * 删除以node为根的红黑树的最小节点
     * 深度优先遍历，递归实现
     */
    private Node removeMin(Node node){
        if(node.left == null){
            Node rightNode = node.right;
            node.right = null;
            size --;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    public V remove(K key) {
        Node node = getNode(root,key);
        if(node != null){
            root = remove(root, key);
            return node.value;
        }
        return null;
    }

    /**
     * 删除以node为根的红黑树中的指定元素
     * 深度优先遍历，递归实现
     */
    private Node remove(Node node, K key) {
        if(node == null){
            return null;
        }
        if(key.compareTo(node.key) < 0){
            node.left = remove(node.left,key);
            return node;
        }else if(key.compareTo(node.key) > 0){
            node.right = remove(node.right,key);
            return node;
        }else /*if(key.compareTo(node.key) == 0)*/{
            // 删除右子树为空的情况
            if(node.right == null){
                Node leftNode = node.left;
                node.left = null;
                size --;
                return leftNode;
            }
            // 删除左子树为空的情况
            else if(node.left == null){
                Node rightNode = node.right;
                node.right = null;
                size --;
                return rightNode;
            }
            // 删除左子树、右子树均不为空的情况
            else {
                // 1、删除后用后继节点替代该位置(后继节点即待删除节点右子树中的最小节点)
                // 获得后继节点
                Node successor = minimum(node.right);
                // 删除后继节点，并让待删除节点的右子树成为后继节点的右子树
                successor.right = removeMin(node);
                // 让待删除节点的左子树成为后继节点的左子树
                successor.left = node.left;
                // 将待删除节点的左、右子节点置为空
                node.left = node.right = null;
                return successor;
                /**
                 // 2、删除后用前驱节点替代该位置(前驱节点即待删除节点左子树中的最大节点)
                 // 获得前驱节点
                 Node predecessor = maximize(node.left);
                 // 删除前驱节点，并让待删除节点的左子树成为前驱节点的左子树
                 predecessor.left = removeMax(node);
                 // 让待删除节点的右子树成为前驱节点的右子树
                 predecessor.right = node.right;
                 // 将待删除节点的左、右子节点置为空
                 node.left = node.right = null;
                 return predecessor;
                 */
            }
        }
    }

    public boolean contains(K key) {
        return getNode(root,key) != null;
    }

    public V get(K key) {
        Node node = getNode(root, key);
        return node != null ? node.value : null;
    }

    public void set(K key, V value) {
        Node node = getNode(root, key);
        if(node == null){
            throw new IllegalArgumentException("Set failed. key is not exists!");
        }
        node.value = value;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 根据key获取Node
     */
    public Node getNode(Node node,K key){
        if(node == null){
            return null;
        }

        if(key.compareTo(node.key) == 0){
            return node;
        }else if(key.compareTo(node.key) < 0){
            return getNode(node.left,key);
        }else{
            return getNode(node.right,key);
        }
    }


    /**
     * 节点类
     */
    private class Node{

        private K key;
        public V value;
        private Node left,right;
        private boolean color;

        private Node(K key, V value){
            this.key = key;
            this.value = value;
            left = null;
            right = null;
            color = RED;
        }
    }
}
