package face0801;

public class Solution {
    public int waysToStep(int n) {
        if (n < 3) {
            return n;
        }
        if (n == 3) {
            return 4;
        }

        long[] dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < dp.length; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000007;
        }
        return (int) dp[n];
    }

    public int waysToStep1(int n) {
        if (n < 3) {
            return n;
        }
        if (n == 3) {
            return 4;
        }

        long[] dp = new long[3];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        for (int i = 3; i < n; i++) {
            long num = (dp[0] + dp[1] + dp[2]) % 1000000007;
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = num;
        }
        return (int) dp[2];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.waysToStep(61));
    }
}
