package datastructure.linkedlist.leetcode;

/**
 * 奇偶链表
 */
public class OddEvenLinkedList {

    /**
     * 新建一个链表，扫描两次，取奇偶
     * 代码奇烂无比。。。。。。
     */
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode();
        ListNode p = dummy, odd = head;
        while (odd != null && odd.next != null) {
            p.next = new ListNode(odd.val);
            odd = odd.next.next;
            p = p.next;
        }
        if (odd != null) {
            p.next = new ListNode(odd.val);
            p = p.next;
        }

        ListNode even = head.next;
        while (even != null && even.next != null) {
            p.next = new ListNode(even.val);
            even = even.next.next;
            p = p.next;
        }
        if (even != null) {
            p.next = new ListNode(even.val);
            p = p.next;
        }
        return dummy.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
