package offer31;

import java.util.Stack;

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length) {
            return false;
        }

        int i = 0, j = 0;

        Stack<Integer> stack = new Stack<>();
        while (j < popped.length) {
            if (i == pushed.length) {
                if (stack.peek() == popped[j]) {
                    stack.pop();
                    j++;
                } else {
                    return false;
                }
                continue;
            }

            if (stack.isEmpty()) {
                stack.push(pushed[i]);
                i++;
            } else {
                if (stack.peek() == popped[j]) {
                    stack.pop();
                    j++;
                } else {
                    stack.push(pushed[i]);
                    i++;
                }
            }
        }

        return stack.isEmpty();
    }
}