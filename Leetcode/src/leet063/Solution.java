package leet063;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int i_len = obstacleGrid.length;
        int j_len = obstacleGrid[0].length;
        // 左上角和右下角有障碍时，则无法通过
        if (obstacleGrid[0][0] == 1 || obstacleGrid[i_len - 1][j_len - 1] == 1){
            return 0;
        }

        obstacleGrid[0][0] = 1;

        int i = 0;
        int j = 0;

        while (i < i_len && j < j_len){
            int left = 0;
            int up = 0;

            // 此时必然有上和左
            if (i != 0 && j != 0){
                // 为障碍物时
                if (obstacleGrid[i][j] == 1){
                    // 改为 -1 代表已经操作过
                    obstacleGrid[i][j] = -1;
                }else {
                    left = obstacleGrid[i][j - 1];
                    up = obstacleGrid[i - 1][j];

                    if (left != -1){
                        obstacleGrid[i][j] += left;
                    }

                    if (up != -1){
                        obstacleGrid[i][j] += up;
                    }
                }
            }
            // 此时仅有上
            if (i != 0 && j == 0){
                // 为障碍物时
                if (obstacleGrid[i][j] == 1){
                    // 改为 -1 代表已经操作过
                    obstacleGrid[i][j] = -1;
                }else {
                    up = obstacleGrid[i - 1][j];
                    if (up != -1){
                        obstacleGrid[i][j] += up;
                    }
                }
            }

            // 此时仅有左
            if (i == 0 && j != 0){
                // 为障碍物时
                if (obstacleGrid[i][j] == 1){
                    // 改为 -1 代表已经操作过
                    obstacleGrid[i][j] = -1;
                }else {
                    left = obstacleGrid[i][j - 1];

                    if (left != -1){
                        obstacleGrid[i][j] += left;
                    }
                }
            }

            j++;
            if (j % j_len == 0){
                j = 0;
                i ++;
            }
        }
        return obstacleGrid[i_len - 1][j_len - 1];
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        int[][] grid = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        //System.out.println(s.uniquePathsWithObstacles(grid));

        int[][] grid2 = {
                {0,0,0,0},
                {0,1,0,0},
                {0,0,0,0}
        };
        //System.out.println(s.uniquePathsWithObstacles(grid2));

        int[][] grid3 = {
                {0}
        };
        System.out.println(s.uniquePathsWithObstacles(grid3));

    }
}
