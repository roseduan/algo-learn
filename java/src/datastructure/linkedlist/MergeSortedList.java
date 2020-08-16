package datastructure.linkedlist;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/6 0:19
 * @description 合并两个有序的链表
 */
public class MergeSortedList {

    public ListNode merge(ListNode la, ListNode lb) {
        if(la == null && lb == null) {
            return null;
        }
        if(la == null) {
            return lb;
        }
        if(lb == null) {
            return la;
        }
        ListNode p = la;
        ListNode q = lb;
        ListNode head = null;

        //比较第一个元素
        if(p.val < q.val) {
            head = p;
            p = p.next;
        }else {
            head = q;
            q = q.next;
        }
        //比较后面的元素
        ListNode r = head;
        while(p != null && q != null) {
            if(p.val < q.val) {
                r.next = p;
                p = p.next;
            }else {
                r.next = q;
                q = q.next;
            }
            r = r.next;
        }
        //比较链表可能剩余的元素
        while(p != null) {
            r.next = p;
            p = p.next;
            r = r.next;
        }
        while(q != null) {
            r.next = q;
            q = q.next;
            r = r.next;
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
