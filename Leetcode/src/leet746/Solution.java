package leet746;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length < 2){
            return 0;
        }

        // dp 数组的递推公式
        // dp[i] = Math.min(dp[i - 1] + cost[i - 1],dp[i - 2] + cost[i - 2]);

        int[] dp = new int[cost.length + 1];

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2;i<dp.length;i++){
            dp[i] = Math.min(dp[i - 1] + cost[i - 1],dp[i - 2] + cost[i - 2]);
        }

        return dp[cost.length];
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(s.minCostClimbingStairs(arr));
    }
}
