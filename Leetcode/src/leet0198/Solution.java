package leet0198;

import java.util.Arrays;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }else if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);


        for (int i = 2;i<nums.length;i++){
            dp[i] = Math.max(dp[i - 2] + nums[i],dp[i - 1]);
        }

        System.out.println(Arrays.toString(dp));
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2,7,9,3,1};
        s.rob(arr);
    }
}
