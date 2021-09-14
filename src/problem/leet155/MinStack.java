package problem.leet155;

import java.util.Stack;
public class MinStack {

    Stack<Integer> normelStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int val) {
        normelStack.push(val);
        if(minStack.empty() || val < getMin()){
            minStack.push(val);
        }else{
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        normelStack.pop();
        minStack.pop();
    }

    public int top() {
        return normelStack.peek();
    }

    public int getMin() {return minStack.peek();}
}
