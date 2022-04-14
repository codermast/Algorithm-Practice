package leet946;

import java.util.Stack;

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length){
            return false;
        }

        int i = 0,j = 0;

        Stack<Integer> stack = new Stack<>();
        while  (j < popped.length){
            if (i == pushed.length){
                if (stack.peek() == popped[j]){
                    stack.pop();
                    j++;
                }else {
                    return false;
                }
                continue;
            }

            if (stack.isEmpty()){
                stack.push(pushed[i]);
                i++;
            }else {
                if (stack.peek() == popped[j]){
                    stack.pop();
                    j++;
                }else {
                    stack.push(pushed[i]);
                    i++;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,3,2,1};
        System.out.println(s.validateStackSequences(arr1, arr2));
    }
}