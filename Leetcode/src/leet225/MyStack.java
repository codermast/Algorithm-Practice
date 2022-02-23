package leet225;

// https://leetcode-cn.com/problems/implement-stack-using-queues/

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {

    public int size;
    Queue<Integer> queue = new ArrayDeque<>();
    /** Initialize your data structure here. */
    public MyStack() {
        this.size = queue.size();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        size ++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for(int i = 0;i<size-1;i++){
            queue.offer(queue.poll());
        }
        size --;
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        for(int i = 0;i<size-1;i++){
            queue.offer(queue.poll());
        }
        int poll = queue.poll();
        queue.offer(poll);
        return poll;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return (queue.size() == 0);
    }
}
