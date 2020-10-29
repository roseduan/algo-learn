package datastructure.linkedlist.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author roseduan
 * 链表的交点
 */
public class IntersectionLinkedList {

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode p = headA;
        while (p != null) {
            set.add(p);
            p = p.next;
        }

        ListNode q = headB;
        while (q != null) {
            if (set.contains(q)) {
                return q;
            }
            q = q.next;
        }
        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while (p != q) {
            p = p == null ? headB : p.next;
            q = q == null ? headA : q.next;
        }
        return p;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
