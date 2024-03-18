package leetcode_62;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        for (int i = 1; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            dp[0][i] = 1;
        }

        int i = 1, j = 1;

        while (i < m && j < n) {
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            j++;

            if (j == n) {
                j = 1;
                i++;
            }
        }
        return dp[m - 1][n - 1];
    }
}
