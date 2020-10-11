package datastructure.linkedlist.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/6 0:17
 * @description 检测链表中的环
 */
public class CircleInLinkedList {

    /**
     * 快慢指针法
     */
    public boolean checkCircle1(ListNode node) {
        if(node == null) {
            return false;
        }
        ListNode fast = node.next;
        ListNode slow = node;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    /**
     * 使用一个哈希表
     */
    public boolean checkCircle2(ListNode node) {
        Set<ListNode> set = new HashSet<>();
        ListNode p = node;
        while (p != null) {
            if (set.contains(p)) {
                return true;
            }
            set.add(p);
            p = p.next;
        }
        return false;
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
