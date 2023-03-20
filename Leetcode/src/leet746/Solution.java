package leet746;

public class Solution {
    // 动态规划法1：使用dp数组记录每一步所需要花费的最小体力
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 1) {
            return cost[0];
        }

        // 定义 dp 数组
        int[] dp = new int[cost.length];

        // 初始化 dp 数组
        dp[0] = cost[0];
        dp[1] = cost[1];
        // 递推公式 ： dp[i] = Math.min(dp[i - 1],dp[i - 2]) + cost[i];

        // dp[i] : 到达第 i 个阶梯所的最小花费
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }

    // 动态规划法2：将dp数组进行优化
    public int minCostClimbingStairs2(int[] cost) {
        if (cost.length == 1) {
            return cost[0];
        }

        // 定义 dp 数组
        int[] dp = new int[2];

        // 初始化 dp 数组
        dp[0] = cost[0];
        dp[1] = cost[1];
        // 递推公式 ： dp[1] = Math.min(num,dp[0]) + cost[i];

        // dp[i] : 到达第 i 个阶梯所的最小花费
        for (int i = 2; i < cost.length; i++) {
            int num = dp[0];
            dp[0] = dp[1];
            dp[1] = Math.min(num, dp[0]) + cost[i];
        }
        return Math.min(dp[0], dp[1]);
    }

    // 动态规划法3：将dp数组进行简化
    public int minCostClimbingStairs3(int[] cost) {
        int[] dp = new int[2];

        // 数组会默认初始化为0
        //dp[0] = 0;
        //dp[1] = 0;

        for(int i = 2; i <= cost.length;i++){
            int tmp = Math.min(dp[1] + cost[i - 1],dp[0] + cost[i -2]);
            dp[0] = dp[1];
            dp[1] = tmp;
        }
        return dp[1];
    }

    // 测试用例
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int[] arr2= {10,15,20};
        System.out.println(s.minCostClimbingStairs3(arr));
        System.out.println(s.minCostClimbingStairs3(arr2));
    }
}
