package face1716;

public class Solution {
    public int massage(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // dp[i] 记录的是 当前i下的最大值
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 3, 1};
        System.out.println(s.massage(arr));
    }
}
