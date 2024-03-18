package leetcode_70;

public class ClimbingStairs {
    // 递归实现
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    // 动态规划
    public int climbStairs1(int n) {
        if (n < 3) {
            return n;
        }

        int[] dp = new int[2];

        dp[0] = 1;
        dp[1] = 2;

        for (int i = 0; i < n - 2; i++) {
            int sum = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = sum;
        }
        return dp[1];
    }
}
