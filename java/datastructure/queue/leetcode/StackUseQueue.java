package datastructure.queue.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author roseduan
 * 使用队列实现栈
 */
public class StackUseQueue {

    private Queue<Integer> queue;
    
    /** Initialize your data structure here. */
    public StackUseQueue() {
        this.queue = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        int n = queue.size();
        queue.offer(x);
        for (int i = 0; i < n; i++) {
            queue.offer(queue.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
