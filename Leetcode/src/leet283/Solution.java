package leet283;

import java.util.Stack;

public class Solution {
    public void moveZeroes(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for(int i : nums){
            if(i != 0){
                stack.push(i);
            }
        }
        for(int i = stack.size();i<nums.length;i++){
            nums[i] = 0;
        }

        for(int i = stack.size() - 1;i>=0;i--){
            nums[i] = stack.pop();
        }
    }
}
