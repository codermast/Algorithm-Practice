package leet0070;

public class Solution {
    // 递归法
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    // 动态规划法1：
    public int climbStairs1(int n) {
        if (n < 2) {
            return n;
        }
        // 定义 dp 数组
        int[] dp = new int[n + 1];

        // 初始化 dp 数组中的初始值
        dp[1] = 1;
        dp[2] = 2;

        // 开始循环遍历
        for (int i = 3; i < dp.length; i++) {
            // 递推公式
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        // 得到返回值
        return dp[n];
    }

    // 动态规划法2：仅保存需要进行递推的两个值
    public int climbStairs2(int n) {
        if (n < 3) {
            return n;
        }
        // 定义 dp 数组
        int[] dp = new int[2];

        // 初始化 dp 数组中的初始值
        dp[0] = 1;
        dp[1] = 2;

        // 开始循环遍历
        // 循环 1 次 得到第 3 个值
        // 循环 n - 2 次 得到第 n 个值
        for (int i = 0; i < n - 2; i++) {
            int num = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = num;
        }
        // 得到返回值
        return dp[1];
    }

    // 1 2 3 5 8 13 21 33 54
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.climbStairs(4));   // 5
        System.out.println(s.climbStairs1(4));  // 5
        System.out.println(s.climbStairs2(4));  // 5
    }
}
