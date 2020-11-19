package datastructure.linkedlist.leetcode;

/**
 * @author roseduan
 * 两数相加
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy, p = l1, q = l2;
        int count = 0;
        while (p != null || q != null) {
            if (p != null) {
                count += p.val;
                p = p.next;
            }
            if (q != null) {
                count += q.val;
                q = q.next;
            }
            cur.next = new ListNode(count % 10);
            cur = cur.next;
            count /= 10;
        }
        if (count > 0) {
            cur.next = new ListNode(count);
        }
        return dummy.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
