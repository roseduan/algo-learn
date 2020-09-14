package datastructure.linkedlist.leetcode;

/**
 * @author roseduan
 * @time 2020/9/10 7:32 下午
 * @description 两两交换链表中的节点
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode p = node;
        while (p.next != null && p.next.next != null) {
            ListNode prev = p.next;
            ListNode next = p.next.next;
            p.next = next;
            prev.next = next.next;
            next.next = prev;
            p = p.next.next;
        }
        return node.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
   }
}
