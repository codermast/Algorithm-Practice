package leet062;

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        int i = 0;
        int j = 0;
        grid[0][0] = 1;

        while(i < m && j < n){
            int left = 0;
            int up = 0;

            // 此时必然有上和左
            if (i != 0 && j != 0){
                left = grid[i][j - 1];
                up = grid[i - 1][j];
            }
            // 此时仅有上
            if (i != 0 && j == 0){
                up = grid[i - 1][j];
            }

            // 此时仅有左
            if (i == 0 && j != 0){
                left = grid[i][j - 1];
            }

            grid[i][j] = left + up + grid[i][j];

            j++;

            if (j % n == 0){
                j = 0;
                i ++;
            }
        }
        return grid[m -1][n -1];
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        System.out.println(s.uniquePaths(3, 7));
        System.out.println(s.uniquePaths(1, 10));
    }
}
