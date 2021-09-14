package problem.leet233;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> pushStack = new Stack<>();
    Stack<Integer> popStack = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {
        while(!pushStack.empty()){
            pushStack.pop();
        }

        while(!popStack.empty()){
            popStack.pop();
        }
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

        while (!pushStack.empty()){
            popStack.push(pushStack.pop());
        }

        return popStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(!popStack.empty()){
            return popStack.peek();
        }

        while (!pushStack.empty()){
            popStack.push(pushStack.pop());
        }

        return popStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return pushStack.empty() && popStack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */