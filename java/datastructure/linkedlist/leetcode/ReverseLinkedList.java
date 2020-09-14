package datastructure.linkedlist.leetcode;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/6 0:16
 * @description 单链表反转
 */
public class ReverseLinkedList {

    public ListNode reverse(ListNode node) {
        ListNode previous = null;
        ListNode current = node;

        while(current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
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
