package leetcode_63;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        dp[0][0] = 1;
        // 障碍物为 1，空位为 0
        // 更新第一列
        for (int i = 1; i < m; i++) {
            if (dp[i - 1][0] == -1) {
                dp[i][0] = -1;
            } else {
                if (obstacleGrid[i][0] == 1) {
                    dp[i][0] = -1;
                } else {
                    dp[i][0] = 1;
                }
            }
        }

        // 更新第一行
        for (int i = 1; i < n; i++) {
            if (dp[0][i - 1] == -1) {
                dp[0][i] = -1;
            } else {
                if (obstacleGrid[0][i] == 1) {
                    dp[0][i] = -1;
                } else {
                    dp[0][i] = 1;
                }
            }
        }

        int i = 1, j = 1;

        while (i < m && j < n) {
            if (obstacleGrid[i][j] == 1) {
                dp[i][j] = -1;
            } else {
                if (dp[i - 1][j] == -1 && dp[i][j - 1] == -1) {
                    dp[i][j] = -1;
                } else if (dp[i - 1][j] == -1) {
                    dp[i][j] = dp[i][j - 1];
                } else if (dp[i][j - 1] == -1) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }

            j++;

            if (j == n) {
                j = 1;
                i++;
            }
        }

        if (dp[m - 1][n - 1] == -1) {
            return 0;
        } else {
            return dp[m - 1][n - 1];
        }
    }
}
