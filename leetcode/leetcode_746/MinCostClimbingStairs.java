package leetcode_746;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 1) {
            return cost[0];
        }

        int[] dp = new int[2];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {

            int minCost = Math.min(dp[0], dp[1]) + cost[i];

            dp[0] = dp[1];
            dp[1] = minCost;
        }
        return Math.min(dp[0], dp[1]);
    }
}
