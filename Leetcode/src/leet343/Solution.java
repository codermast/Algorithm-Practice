package leet343;

public class Solution {
    public int integerBreak(int n) {
        // 创建dp数组，dp[i] 代表了 数 i 拆分以后的最大乘积
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                //j * dp[i - j] 代表将数分为 j 和 i - j 两个部分，对于j就不再分割，(i - j)看作一个整体，进行计算，直接调用dp数组即可
                // 在遍历的时候 j 就已经从 1 - i 进行变化了。
                // 这里考虑到：dp[i - j] 是否已经计算过，当 j >= 1时，则有i - j < i恒成立，故此dp[i - j] 必然计算过了
                // 这里又分为两种情况，将 i-j 进行细分和不细分两种情况
                dp[i] = Math.max(dp[i],Math.max(j * (i - j),j * dp[i - j]));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        System.out.println(s.integerBreak(10));
    }
}
