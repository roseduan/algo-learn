package datastructure.linkedlist.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author roseduan
 * @time 2020/10/24 2:25 下午
 * @description 环形链表
 */
public class LinkedListCycle {

    /**
     * 使用一个set判重
     */
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

    /**
     * 快慢指针法
     */
    public boolean hasCycle2(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }
}
