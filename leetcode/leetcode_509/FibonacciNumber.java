package leetcode_509;

public class FibonacciNumber {
    // 递归实现
    public int fib(int n) {
        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    // 动态规划
    public int fib1(int n) {
        if (n < 2) {
            return n;
        }

        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 0; i < n - 1; i++) {
            int tmp = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = tmp;
        }
        return dp[1];
    }
}
