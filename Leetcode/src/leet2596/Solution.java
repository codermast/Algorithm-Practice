package leet2596;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] grid = {
                {0, 11, 16, 5, 20},
                {17, 4, 19, 10, 15},
                {12, 1, 8, 21, 6},
                {3, 18, 23, 14, 9},
                {24, 13, 2, 7, 22}
        };
        System.out.println(s.checkValidGrid(grid));
    }

    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) {
            return false;
        }

        int sum = grid.length * grid.length - 1;

        int cur = 0;

        int i = 0;
        int j = 0;

        while (cur < sum) {
            boolean isMove = false;

            // 8 种移动方案
            if (checkIndexIsRange(grid.length, i - 1, j - 2) && cur + 1 == grid[i - 1][j - 2]) {
                i = i - 1;
                j = j - 2;
                cur++;
                isMove = true;
                continue;
            }


            if (checkIndexIsRange(grid.length, i - 2, j - 1) && cur + 1 == grid[i - 2][j - 1]) {
                i = i - 2;
                j = j - 1;
                cur++;
                isMove = true;
                continue;
            }

            if (checkIndexIsRange(grid.length, i - 1, j + 2) && cur + 1 == grid[i - 1][j + 2]) {
                i = i - 1;
                j = j + 2;
                cur++;
                isMove = true;
            }

            if (checkIndexIsRange(grid.length, i - 2, j + 1) && cur + 1 == grid[i - 2][j + 1]) {
                i = i - 2;
                j = j + 1;
                cur++;
                isMove = true;
            }

            if (checkIndexIsRange(grid.length, i + 1, j - 2) && cur + 1 == grid[i + 1][j - 2]) {
                i += 1;
                j -= 2;
                cur++;
                isMove = true;
            }

            if (checkIndexIsRange(grid.length, i + 1, j + 2) && cur + 1 == grid[i + 1][j + 2]) {
                i = i + 1;
                j = j + 2;
                cur++;
                isMove = true;
            }

            if (checkIndexIsRange(grid.length, i + 2, j - 1) && cur + 1 == grid[i + 2][j - 1]) {
                i = i + 2;
                j = j - 1;
                cur++;
                isMove = true;
            }

            if (checkIndexIsRange(grid.length, i + 2, j + 1) && cur + 1 == grid[i + 2][j + 1]) {
                i = i + 2;
                j = j + 1;
                cur++;
                isMove = true;
            }

            if (!isMove) {
                return false;
            }
        }
        return true;
    }

    // 检查索引是否越界
    private boolean checkIndexIsRange(int length, int i, int j) {
        return (i >= 0 && i < length && j >= 0 && j < length);
    }
}
