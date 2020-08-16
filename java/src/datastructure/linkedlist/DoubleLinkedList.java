package datastructure.linkedlist;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @date 2019/11/29 23:32
 * @decription 双向链表的实现
 */
public class DoubleLinkedList {

    private LisNode head;

    public DoubleLinkedList(int val) {
        this.head = new LisNode(val);
    }

    /**
     * 链表节点
     */
    private static class LisNode {
        int val;
        LisNode prev;
        LisNode next;
        LisNode(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    /**
     * 查找
     */
    public LisNode find(int value){
        LisNode p = head;
        while (p != null && p.val != value){
            p = p.next;
        }

        return p;
    }

    /**
     * 插入
     */
    public void add(int value) {
        LisNode node = new LisNode(value);
        if (head == null) {
            head = node;
            node.prev = head;
            return;
        }
        LisNode p = head;
        while (p.next != null){
            p = p.next;
        }
        p.next = node;
        node.prev = p;
    }

    /**
     * 插入到链表头部
     */
    public void addFirst(int value){
        LisNode node = new LisNode(value);
        if (head == null){
            head = node;
            node.prev = head;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    /**
     * 在某个节点之前插入数据
     */
    public void addBefore(LisNode p, int value){
        if (p == null){
            return;
        }
        if (p == head){
            addFirst(value);
        }
        else {
            LisNode node = new LisNode(value);
            node.next = p;
            p.prev.next = node;
            node.prev = p.prev;
            p.prev = node;
        }
    }

    /**
     * 删除数据
     */
    public void remove(int value){
        LisNode node = find(value);
        if (node == null){
            return;
        }
        //删除的是头节点
        if (node == head){
            head = head.next;
            if (head != null){
                head.prev = null;
            }
        }
        else {
            node.prev.next = node.next;
            if (node.next != null){
                node.next.prev = node.prev;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LisNode p = head;
        while (p != null) {
            sb.append(p.val).append(" ");
            p = p.next;
        }

        return sb.toString();
    }
}
