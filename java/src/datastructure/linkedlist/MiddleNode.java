package datastructure.linkedlist;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/6 0:21
 * @description 找到链表的中间节点
 */
public class MiddleNode {
    
    public ListNode findMiddleNode(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static class ListNode{
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
}
