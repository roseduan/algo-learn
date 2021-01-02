package datastructure.linkedlist.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 回文链表
 */
public class PalindromeLinkedList {

    /**
     * 使用一个数组存储
     */
    public boolean isPalindrome1(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        if (list.size() > 1) {
            for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
                 if (!list.get(i).equals(list.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 原地遍历
     */
    public boolean isPalindrome2(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        //先找到中间节点
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //反转从链表头到中间的节点
        ListNode prev = null, cur = head;
        while (cur != slow) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        //从中间依次往两边遍历比较
        ListNode q = slow.next;
        if (fast == null) {
            q = slow;
        }

        while (prev != null && q != null) {
            if (prev.val != q.val) {
                return false;
            }

            prev = prev.next;
            q = q.next;
        }

        return true;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
