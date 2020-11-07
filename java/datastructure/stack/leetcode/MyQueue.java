package datastructure.stack.leetcode;

import java.util.Stack;

/**
 * @author roseduan
 * 用栈实现队列
 */
public class MyQueue {

    private Stack<Integer> input;
    private Stack<Integer> output;

    /** Initialize your data structure here. */
    public MyQueue() {
        this.input = new Stack<>();
        this.output = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return output.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return input.empty() && output.empty();
    }
}
