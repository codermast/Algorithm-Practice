package leet064;

import java.util.Arrays;

public class Solution {
    // 二维动规
    public int minPathSum(int[][] grid) {
        // 一行一列
        if (grid.length == 1 || grid[0].length == 1) {
            int ret = 0;
            for (int[] ints : grid) {
                for (int anInt : ints) {
                    ret += anInt;
                }
            }
            return ret;
        }
        int len = grid.length, wide = grid[0].length;
        // 多行多列

        // 填充第一行
        for (int i = 1; i < wide; i++) {
            grid[0][i] += grid[0][i - 1];
        }

        // 填充第一列
        for (int i = 1; i < len; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        // 开始填充中间内容
        int i = 1, j = 1;

        while (i < len) {
            grid[i][j] = grid[i][j] + Math.min(grid[i - 1][j], grid[i][j - 1]);
            j++;

            if (j == wide) {
                j = 1;
                i++;
            }
        }
        return grid[len - 1][wide - 1];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};

        int[][] grid2 = {
                {1, 2},
                {5, 6},
                {1, 1}
        };
        System.out.println(s.minPathSum(grid));

        System.out.println(s.minPathSum(grid2));
    }
}
