package leetcode_999;

public class NumRockCaptures {
    public int numRookCaptures(char[][] board) {

        int num = 0;
        int rowIndex = board.length - 1;
        int colIndex = board[0].length - 1;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        for (int i = rowIndex; i >= 0; i--) {
            if (board[i][colIndex] == 'B') {
                break;
            } else if (board[i][colIndex] == 'p') {
                num += 1;
                break;
            }
        }

        for (int i = rowIndex; i < board.length; i++) {
            if (board[i][colIndex] == 'B') {
                break;
            } else if (board[i][colIndex] == 'p') {
                num += 1;
                break;
            }
        }

        for (int i = colIndex; i < board[0].length; i++) {
            if (board[rowIndex][i] == 'B') {
                break;
            } else if (board[rowIndex][i] == 'p') {
                num += 1;
                break;
            }
        }

        for (int i = colIndex; i >= 0; i--) {
            if (board[rowIndex][i] == 'B') {
                break;
            } else if (board[rowIndex][i] == 'p') {
                num += 1;
                break;
            }
        }

        return num;
    }
}
