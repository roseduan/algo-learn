package datastructure.linkedlist;

/**
 * @author roseduan
 * @time 2019/10/19 22:30
 * @description 循环链表简单实现，约瑟夫问题
 */
public class CircleLinkedList {

    private ListNode head;

    private CircleLinkedList(int val) {
        this.head = new ListNode(val);
        this.head.next = head;
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
     * 查找
     */
    public ListNode find(int value){
        if (head == null){
            return null;
        }

        ListNode p = head;
        while (p.next != head && p.val != value){
            p = p.next;
        }
        return p;
    }

    /**
     * 插入
     */
    public void add(int value){
        ListNode node = new ListNode(value);
        if (head == null){
            head = node;
            head.next = head;
        }

        ListNode p = head;
        while (p.next != head){
            p = p.next;
        }
        node.next = head;
        p.next = node;
    }

    /**
     * 删除
     */
    public boolean remove(int value) {
        if (head == null){
            return false;
        }
        if (head.next == head && head.val == value){
            head = null;
            return true;
        }
        ListNode prev = null;
        ListNode p = head;
        while (p.next != head && p.val != value){
            prev = p;
            p = p.next;
        }
        //未找到被删除节点
        if (p.val != value){
            return false;
        }
        //删除的是头节点
        if (prev == null){
            ListNode prevHead = head;
            while (prevHead.next != head){
                prevHead = prevHead.next;
            }
            prevHead.next = head.next;
            head = head.next;
            return true;
        }
        prev.next = p.next;
        return true;
    }

    /**
     * 使用循环链表解决约瑟夫问题
     */
    private ListNode survive(int k){
        if (head == null || head.next == head){
            return head;
        }
        int count = 0;
        ListNode p = head;
        while (count++ != k + 1){
            p = p.next;
        }
        remove(p.val);
        return survive(k);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode p = head;
        if (p == null){
            return result.toString();
        }

        while (p.next != head){
            result.append(p.val).append(" ");
            p = p.next;
        }
        result.append(p.val);
        return result.toString();
    }
}
