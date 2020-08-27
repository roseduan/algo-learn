package datastructure.queue;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/10/31 23:30
 * @description 使用链表实现队列
 */
public class LinkedQueue<T> {

    private ListNode<T> head;
    private ListNode<T> tail;
    private int size;

    public LinkedQueue(T val) {
        ListNode<T> node = new ListNode<>(val);
        this.head = node;
        this.tail = node;
        this.size = 1;
    }

    private static class ListNode<T>{
        T val;
        ListNode<T> next;

        ListNode(T val) {
            this.val = val;
            this.next = null;
        }
    }

    /**
     * 入队列
     */
    public boolean add(T value) {
        ListNode<T> node = new ListNode<>(value);
        if (head == null) {
            head = node;
        }
        else {
            tail.next = node;
        }

        tail = node;
        size++;
        return true;
    }

    /**
     * 出队列
     */
    public T dequeue() {
        if (head == null){
            return null;
        }

        ListNode<T> result = head;
        T val = result.val;
        head = head.next;
        result = null;
        size--;

        return val;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        ListNode<T> p = head;
        while (p != null) {
            sb.append(p.val).append(" ");
            p = p.next;
        }

        return sb.toString();
    }
}
