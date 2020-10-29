package datastructure.linkedlist.leetcode;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/6 0:16
 * @description 单链表反转
 */
public class ReverseLinkedList {

    /**
     * 迭代
     */
    public ListNode reverseList1(ListNode head) {
        ListNode prev = null, cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    /**
     * 递归
     */
    public ListNode reverseList2(ListNode head) {
        return helper(null, head);
    }

    private ListNode helper(ListNode prev, ListNode cur) {
        if (cur == null) {
            return prev;
        }

        ListNode next = cur.next;
        cur.next = prev;
        return helper(cur, next);
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
