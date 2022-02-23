package face0302;

// https://leetcode-cn.com/problems/min-stack-lcci/

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if(minStack.empty()){
            minStack.push(x);
        }else{
            if(x<getMin()){
                minStack.push(x);
            }else{
                minStack.push(getMin());
            }
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}