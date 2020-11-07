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
        return false;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
