package datastructure.stack.leetcode;

import java.util.Stack;

/**
 * @author roseduan
 * 最小栈
 */
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> helper;

     /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack<>();
        this.helper = new Stack<>();
        this.helper.push(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
        this.stack.push(x);
        this.helper.push(Math.min(x, this.helper.peek()));
    }
    
    public void pop() {
        this.stack.pop();
        this.helper.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.helper.peek();
    }
}
