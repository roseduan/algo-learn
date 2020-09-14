package datastructure.linkedlist.leetcode;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/6 0:20
 * @description 删除链表倒数第k个节点
 */
public class DeleteKthNode {

    public ListNode deleteLastKth(ListNode head, int k) {
        ListNode fast = head;
        int i = 1;
        //先让前面的指针移动k - 1步
        while(fast != null && i < k) {
            fast = fast.next;
            ++ i;
        }
        ListNode slow = head;
        ListNode prev = null;
        //前后指针同时移动
        while(fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        //说明删除的是第一个节点
        if(prev == null) {
            head = head.next;
        }else {
            prev.next = prev.next.next;
        }
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
