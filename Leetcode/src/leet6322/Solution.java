package leet6322;

public class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) {
            return false;
        }
        int[] ret = checkArri(0, 0, grid);
        while (ret != null) {
            ret = checkArri(ret[0], ret[1], grid);
            if (ret == null) {
                return false;
            }

            if (grid[ret[0]][ret[1]] + 1 == grid.length * grid[0].length) {
                return true;
            }
        }
        return false;
    }

    public int[] checkArri(int i, int j, int[][] grid) {
        int len_i = grid.length;
        int len_j = grid[0].length;
        if (i - 1 >= 0 && i - 1 < len_i && j - 2 >= 0 && j - 2 < len_j) {
            if (grid[i - 1][j - 2] == grid[i][j] + 1) {
                return new int[]{i - 1, j - 2};
            }
        }

        if (i - 1 >= 0 && i - 1 < len_i && j + 2 >= 0 && j + 2 < len_j) {
            if (grid[i - 1][j + 2] == grid[i][j] + 1) {
                return new int[]{i - 1, j + 2};
            }
        }

        if (i + 1 >= 0 && i + 1 < len_i && j - 2 >= 0 && j - 2 < len_j) {
            if (grid[i + 1][j - 2] == grid[i][j] + 1) {
                return new int[]{i + 1, j - 2};
            }
        }
        if (i + 1 >= 0 && i + 1 < len_i && j + 2 >= 0 && j + 2 < len_j) {
            if (grid[i + 1][j + 2] == grid[i][j] + 1) {
                return new int[]{i + 1, j + 2};
            }
        }

        if (i - 2 >= 0 && i - 2 < len_i && j - 1 >= 0 && j - 1 < len_j) {
            if (grid[i - 2][j - 1] == grid[i][j] + 1) {
                return new int[]{i - 2, j - 1};
            }
        }

        if (i - 2 >= 0 && i - 2 < len_i && j + 1 >= 0 && j + 1 < len_j) {
            if (grid[i - 2][j + 1] == grid[i][j] + 1) {
                return new int[]{i - 2, j + 1};
            }
        }

        if (i + 2 >= 0 && i + 2 < len_i && j - 1 >= 0 && j - 1 < len_j) {
            if (grid[i + 2][j - 1] == grid[i][j] + 1) {
                return new int[]{i + 2, j - 1};
            }
        }
        if (i + 2 >= 0 && i + 2 < len_i && j + 1 >= 0 && j + 1 < len_j) {
            if (grid[i + 2][j + 1] == grid[i][j] + 1) {
                return new int[]{i + 2, j + 1};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] grid = {
                {0, 11, 16, 5, 20},
                {17, 4, 19, 10, 15},
                {12, 1, 8, 21, 6},
                {3, 18, 23, 14, 9},
                {24, 13, 2, 7, 22}
        };

        int[][] grid2 = {
                {0, 13, 1, 7, 20},
                {3, 8, 19, 12, 15},
                {18, 2, 14, 21, 6},
                {9, 4, 23, 16, 11},
                {24, 17, 10, 5, 22}
        };

        int[][] grid3 = {
                {20, 15, 10, 3, 22},
                {9, 4, 21, 16, 11},
                {14, 19, 6, 23, 2},
                {5, 8, 1, 12, 17},
                {0, 13, 18, 7, 24}
        };
        //System.out.println(s.checkValidGrid(grid));
        System.out.println(s.checkValidGrid(grid3));
    }
}
