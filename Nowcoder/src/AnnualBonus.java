public class AnnualBonus {
    public int getMost(int[][] board) {
        // write code here

        // 初始化第一行
        for (int k = 1; k < board[0].length; k++) {
            board[0][k] += board[0][k - 1];
        }

        // 初始化第一列
        for (int k = 1; k < board.length; k++) {
            board[k][0] += board[k - 1][0];
        }

        int i = 1;
        int j = 1;

        while (i <= 5 && j <= 5) {
            board[i][j] += Math.max(board[i][j - 1], board[i - 1][j]);
            j++;
            if (j == 6) {
                i++;
                j = 1;
            }
        }
        return board[5][5];
    }
}
