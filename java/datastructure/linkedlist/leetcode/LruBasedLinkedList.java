package datastructure.linkedlist.leetcode;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/10/26 20:13
 * @description 使用双向链表实现简单的LRU缓存
 */
public class LruBasedLinkedList {

    private static final int DEFAULT_CAPACITY = 10;

    private ListNode head;
    private int capacity;
    private int size;

    private LruBasedLinkedList(ListNode head, int capacity) {
        this.head = head;
        this.capacity = capacity;
        this.size = 1;
    }

    private LruBasedLinkedList(ListNode head){
        this(head, DEFAULT_CAPACITY);
    }

    private static class ListNode{
        int val;
        ListNode prev;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    /**
     * 查找缓存
     */
    private ListNode findCache(int value){
        if (head == null){
            return null;
        }

        ListNode p = head;
        while (p != null && p.val != value){
            p = p.next;
        }
        ListNode result = p;

        //查找到的缓存需要将其添加到链表末尾
        if (p != null && p.next != null){
            delete(p);
            add(p.val);
        }

        return result;
    }

    /**
     * 添加缓存
     */
    private void addCache(int value) {
        //缓存已满，删除第一个缓存，新的缓存添加至末尾
        if (size >= capacity) {
            deleteHead();
            add(value);
        }
        //缓存未满，直接添加至末尾
        else {
            add(value);
            size++;
        }
    }

    /**
     * 删除缓存
     */
    private void deleteCache(int value){
        if (head == null){
            return;
        }

        ListNode p = head;
        while (p != null && p.val != value){
            p = p.next;
        }

        delete(p);
        size--;
    }

    /**
     * 删除某节点之后的节点
     */
    private void delete(ListNode delNode){
        if (head == null || delNode == null){
            return;
        }

        ListNode node = delNode.prev;

        //删除的是头节点
        if (node == null && head == delNode){
            ListNode next = head.next;
            head = next;
            next.prev = null;
            return;
        }

        //常规删除
        if (node != null){
            ListNode next = delNode.next;
            node.next = next;
            next.prev = node;
        }
    }

    /**
     * 删除头节点
     */
    private void deleteHead(){
        if (head == null){
            return;
        }
        head = head.next;
        head.prev = null;
    }

    /**
     * 添加节点至链表末尾
     */
    private void add(ListNode node){
        if (node == null){
            return;
        }
        if (head == null){
            head = node;
            return;
        }

        ListNode p = head;
        while (p.next != null){
            p = p.next;
        }

        p.next = node;
        node.prev = p;
    }

    private void add(int value){
        add(new ListNode(value));
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode p = head;

        while (p != null){
            res.append(p.val).append(" ");
            p = p.next;
        }

        return res.toString();
    }
}
