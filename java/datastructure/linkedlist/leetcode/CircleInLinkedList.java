package datastructure.linkedlist.leetcode;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/6 0:17
 * @description 检测链表中的环
 */
public class CircleInLinkedList {

    public boolean checkCircle(ListNode node) {
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

    private static class ListNode{
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

}
