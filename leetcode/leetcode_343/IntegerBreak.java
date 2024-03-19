package leetcode_343;

public class IntegerBreak {
    public int integerBreak(int n) {
        // dp[i] == 将数字 i 拆分，最大的乘积
        int[] dp = new int[n];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(j * dp[i - j], dp[i]);
            }
        }
        return dp[n - 1];
    }
}
