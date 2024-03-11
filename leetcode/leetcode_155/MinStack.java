package leetcode_155;

import java.util.Stack;

public class MinStack {

    Stack<Integer> elementStack;
    Stack<Integer> minStack;

    public MinStack() {
        this.elementStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        elementStack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
            return;
        }
        minStack.push(val < minStack.peek() ? val : minStack.peek());
    }

    public void pop() {
        elementStack.pop();
        minStack.pop();
    }

    public int top() {
        return elementStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
