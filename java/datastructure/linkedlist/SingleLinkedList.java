package datastructure.linkedlist;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/10/19 22:20
 * @description 单链表基本实现
 */
public class SingleLinkedList {

    private ListNode head;

    private SingleLinkedList(int val) {
        this.head = new ListNode(val);
    }

    private static class ListNode{
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /**
     * 查找节点
     */
    public ListNode find(int value){
        if (head == null){
            return null;
        }
        ListNode p = head;
        while (p != null && p.val != value){
            p = p.next;
        }
        return p;
    }

    /**
     * 插入元素
     */
    public ListNode add(int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
        }
        else {
            ListNode p = head;
            while (p.next != null){
                p = p.next;
            }
            p.next = node;
        }
        return head;
    }

    /**
     * 删除元素
     */
    public boolean remove(int value){
        if (head == null){
            return false;
        }
        ListNode prev = null;
        ListNode p = head;
        while (p != null && p.val != value){
            prev = p;
            p = p.next;
        }
        if (p == null){
            return false;
        }
        if (prev == null){
            head = head.next;
        }
        else {
            prev.next = p.next;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode p = head;
        while (p != null){
            result.append(p.val).append(" ");
            p = p.next;
        }
        return result.toString();
    }

}
