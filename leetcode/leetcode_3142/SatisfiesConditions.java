package leetcode_3142;

public class SatisfiesConditions {
    public boolean satisfiesConditions(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // 如果下方格子存在
                if (i + 1 < grid.length) {
                    if (grid[i][j] != grid[i + 1][j]) {
                        return false;
                    }
                }

                // 如果右方格子存在
                if (j + 1 < grid[0].length) {
                    if (grid[i][j] == grid[i][j + 1]) {
                        return false;
                    }
                }

            }
        }
        return true;
    }
}
