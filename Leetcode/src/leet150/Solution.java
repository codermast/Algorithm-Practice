package leet150;

import java.util.Stack;

public class Solution {
    /*
    *   逆波兰表达式
    * */
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String str = tokens[i];
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                if (str.equals("+")) {
                    stack.push(num2 + num1);
                } else if (str.equals("-")) {
                    stack.push(num2 - num1);
                } else if (str.equals("*")) {
                    stack.push(num2 * num1);
                } else if (str.equals("/")) {
                    stack.push(num2 / num1);
                }
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}