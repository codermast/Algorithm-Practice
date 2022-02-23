package offer09;

import java.util.Stack;

public class CQueue {

    // 进栈
    Stack<Integer> stack1 = new Stack<>();
    // 出栈
    Stack<Integer> stack2 = new Stack<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(!stack2.empty()){
            return stack2.pop();
        }

        // 下面即为 stack2为空
        if(stack1.empty()){
           return -1;
        }

        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }

        return stack2.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
