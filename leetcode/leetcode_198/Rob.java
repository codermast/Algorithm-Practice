package leetcode_198;

public class Rob {
    public int rob(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        if (nums.length == 1){
            return nums[0];
        }

        int[] dp = new int[2];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++){
            int tmp = dp[1];
            dp[1] = Math.max(dp[1], nums[i] + dp[0]);
            dp[0] = tmp;
        }

        return dp[1];
    }
}
