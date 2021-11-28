package problem.leet232;


import java.util.Stack;

// 双栈实现队列
class MyQueue {

    Stack<Integer> pushStack;
    Stack<Integer> popStack;
    public MyQueue() {
        // 压进的栈
        pushStack = new Stack<>();
        // 弹出的栈
        popStack = new Stack<>();
    }
    /*
    *   入队列
    * */
    public void push(int x) {
        pushStack.push(x);
    }
    /*
    *   出队列，将两栈的顺序逆置
    * */
    public int pop() {
        if(!popStack.empty()){
            return popStack.pop();
        }

        while(!pushStack.empty()){
            popStack.push(pushStack.pop());
        }

        return popStack.pop();

    }
    /*
    *   如果不为空，则逆置以后peek
    * */
    public int peek() {
        if(!popStack.empty()){
            return popStack.peek();
        }

        while(!pushStack.empty()){
            popStack.push(pushStack.pop());
        }

        return popStack.peek();
    }
    /*
    *   两栈都为空则为空，其余则都不为空
    * */
    public boolean empty() {
        return pushStack.empty() && popStack.empty();
    }
}
