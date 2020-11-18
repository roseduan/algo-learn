package datastructure.linkedlist.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/6 0:21
 * @description 找到链表的中间节点
 */
public class MiddleNode {

    /**
     * 使用一个数组
     */
    public ListNode findMiddleNode1(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        return list.get(list.size() / 2);
    }
    
    /**
     * 计数法，两次遍历
     */
    public ListNode findMiddleNode2(ListNode head) {
        int count = 0;
        ListNode p = head;
        while (p != null) {
            count++;
            p = p.next;
        }

        count /= 2;
        p = head;
        while (count-- > 0) {
            p = p.next;
        }
        return p;
    }

    /**
     * 双指针法
     */
    public ListNode findMiddleNode3(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
