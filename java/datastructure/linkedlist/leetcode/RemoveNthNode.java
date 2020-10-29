package datastructure.linkedlist.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author roseduan
 * @time 2020/10/24 9:43 下午
 * @description 删除链表倒数第N个节点
 */
public class RemoveNthNode {

    /**
     * 使用一个数组存储一下，然后再找到倒数第N个节点
     */
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            list.add(p);
            p = p.next;
        }

        if (n == list.size()) {
            return head.next;
        }
        ListNode node = list.get(list.size() - n - 1);
        node.next = node.next == null ? null : node.next.next;
        return head;
    }

    /**
     * 快慢指针法
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next == null ? null : slow.next.next;
        return head;
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
