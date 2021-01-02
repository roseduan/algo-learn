package datastructure.linkedlist.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author roseduan
 * @time 2021/1/2 12:04 上午
 * @description k个一组翻转链表
 */
public class ReverseNodesKGroup {

    /**
     * 比较易于理解的暴力法
     * 先将链表数据存储到数组中，再反转，然后构建新的链表
     */
    public ListNode reverseKGroup1(ListNode head, int k) {
        if (k <= 1) {
            return head;
        }

        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        Integer[] array = list.toArray(new Integer[]{});
        int step = 0;
        while (step + k <= array.length) {
            reverseArr(step, step + k - 1, array);
            step += k;
        }

        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        for (Integer integer : array) {
            p.next = new ListNode(integer);
            p = p.next;
        }

        return dummy.next;
    }

    private void reverseArr(int x, int y, Integer[] arr){
        for (int i = x, j = y; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * 官方解法
     */
    public ListNode reverseKGroup2(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy, end = dummy;

        while (end.next != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }

            ListNode start = prev.next, next = end.next;
            end.next = null;
            prev.next = reverseList(start);
            start.next = next;

            prev = end = start;
        }

        return dummy.next;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null, p = head;
        while (p != null) {
            ListNode next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }

        return prev;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
