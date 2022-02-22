package problem.leet509;

/*
 *   斐波那契数列
 * */
public class Solution {
    // 递归法
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // 动态规划法1：（使用dp数组进行记录）
    public int fib2(int n) {
        if (n < 2) {
            return n;
        }

        // dp[i] 记录的是 第 i 个斐波那契数
        int[] dp = new int[n + 1];

        // 数组初始化： dp[0] = 0;dp[1] = 1;
        dp[0] = 0;
        dp[1] = 1;

        // 确定遍历顺序 ： n 从小到大遍历
        for (int i = 2; i < dp.length; i++) {
            // 递推公式 ： dp[i] = dp[i - 1] + dp[i - 2]
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // 举例推导dp数组
        // 0 1 1 2 3 5 8 13 21
        return dp[n];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.fib(4));
        System.out.println(s.fib2(4));
    }
}
