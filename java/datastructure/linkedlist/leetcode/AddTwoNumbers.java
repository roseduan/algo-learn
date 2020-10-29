package datastructure.linkedlist.leetcode;

/**
 * @author roseduan
 * 两数相加
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode r = dummy;
        ListNode p = l1, q = l2;
        boolean flag = false;
        while (p != null || q != null) {
            int val = (p == null ? 0 : p.val) + (q == null ? 0 : q.val) + (flag ? 1 : 0);
            if (val >= 10) {
                val %= 10;
                flag = true;
            } else {
                flag = false;
            }
            r.next = new ListNode(val);
            r = r.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (flag) {
            r.next = new ListNode(1);
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
