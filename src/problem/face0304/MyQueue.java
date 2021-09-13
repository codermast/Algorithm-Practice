package problem.face0304;

import java.util.Stack;
// https://leetcode-cn.com/problems/implement-queue-using-stacks-lcci/
public class MyQueue {
    // 进栈
    Stack<Integer> pushStack = new Stack<>();
    // 出栈
    Stack<Integer> popStack = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        pushStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!popStack.empty()){
            return popStack.pop();
        }

        while(!pushStack.empty()){
            popStack.push(pushStack.pop());
        }

        return popStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(!popStack.empty()){
            return popStack.peek();
        }

        while(!pushStack.empty()){
            popStack.push(pushStack.pop());
        }

        return popStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return pushStack.empty() && popStack.empty();
    }
}
