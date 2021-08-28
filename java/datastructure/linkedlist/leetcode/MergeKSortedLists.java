package datastructure.linkedlist.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author roseduan
 * @time 2021/8/27 10:46 上午
 * @description 合并K个有序链表
 */
public class MergeKSortedLists {
    private static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        for (ListNode node : lists) {
            if (node != null) {
                heap.add(node);
            }
        }

        ListNode dummy = new ListNode();
        ListNode p = dummy;
        while (!heap.isEmpty()) {
            ListNode node = heap.poll();
            p.next = node;
            p = p.next;
            if (node.next != null) {
                heap.add(node.next);
            }
        }
        return dummy.next;
    }
}
