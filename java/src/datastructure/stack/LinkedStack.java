package datastructure.stack;

import java.util.EmptyStackException;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/10/27 15:28
 * @description 使用链表实现栈
 */
public class LinkedStack {

    private ListNode head;
    private int size;

    public LinkedStack(int val) {
        this.head = new ListNode(val);
        this.size = 1;
    }

    private static class ListNode{
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /**
     * 入栈
     */
    public void push(int value) {
        ListNode node = new ListNode(value);
        size++;

        if (head == null) {
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }

    /**
     * 出栈
     */
    public int pop(){
        if (head == null){
            throw new EmptyStackException();
        }

        ListNode result = head;
        head = head.next;
        size--;

        return result.val;
    }

    /**
     * 获取栈顶元素
     */
    public int peek(){
        if (head == null){
            throw new EmptyStackException();
        }

        return head.val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode p = head;

        while (p != null){
            sb.append(p.val).append(" ");
            p = p.next;
        }

        return sb.toString();
    }
}
