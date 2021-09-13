package SwordFingerOffer.offer21;

import java.util.Stack;

public class Solution {
    public int[] exchange(int[] nums) {
        int[] ret = new int[nums.length];

        // 奇数栈
        Stack<Integer> odd = new Stack<>();
        // 偶数栈
        Stack<Integer> even = new Stack<>();

        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                even.push(nums[i]);
            }else{
                odd.push(nums[i]);
            }
        }
        int i = 0;
        while(!odd.empty()){
            ret[i] = odd.pop();
            i++;
        }
        while(!even.empty()){
            ret[i] = even.pop();
            i++;
        }
        return ret;
    }
}
