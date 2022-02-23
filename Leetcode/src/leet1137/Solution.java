package leet1137;

public class Solution {

    // 递归法
    public int tribonacci(int n) {
        if (n < 2) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        return tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
    }

    // 动态规划法1：使用 dp 数组进行存储
    public int tribonacci1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

    // 动态规划法2：使用 dp 数组进行存储（仅存储需要递推的三个数）
    public int tribonacci2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }

        int[] dp = new int[3];

        //dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        // 循环 1 次就能得出第 4 个值
        // 循环 n - 3 次就能得出 第 n 个值
        for (int i = 3; i <= n; i++) {
            int num = dp[0] + dp[1] + dp[2];

            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = num;
        }
        return dp[2];
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        // 递归法
        System.out.print(s.tribonacci(1) + " ");
        System.out.print(s.tribonacci(4) + " ");
        System.out.print(s.tribonacci(12) + " ");
        System.out.print(s.tribonacci(13) + " ");
        System.out.print(s.tribonacci(25) + " ");
        System.out.println();

        // 动态规划法1
        System.out.print(s.tribonacci1(1) + " ");
        System.out.print(s.tribonacci1(4) + " ");
        System.out.print(s.tribonacci1(12) + " ");
        System.out.print(s.tribonacci1(13) + " ");
        System.out.print(s.tribonacci1(25) + " ");
        System.out.println();

        // 动态规划法2
        System.out.print(s.tribonacci2(1) + " ");
        System.out.print(s.tribonacci2(4) + " ");
        System.out.print(s.tribonacci2(12) + " ");
        System.out.print(s.tribonacci2(13) + " ");
        System.out.print(s.tribonacci2(25) + " ");
        System.out.println();
    }
}
