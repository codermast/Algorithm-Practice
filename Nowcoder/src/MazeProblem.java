import java.util.LinkedList;
import java.util.Scanner;

public class MazeProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int row = in.nextInt();
            int column = in.nextInt();
            int[][] arr = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            boolean[][] mark = new boolean[row][column];
            LinkedList<int[]> path = new LinkedList<>();
            shortPath = new LinkedList<>();
            shortPath.add(new int[]{6, 6});
            path.add(new int[]{0, 0});
            leastStep = Integer.MAX_VALUE;
            mark[0][0] = true;
            dfs(arr, mark, 0, 0, path, row, column);
            for (int[] ints : shortPath) {
                System.out.println("(" + ints[0] + "," + ints[1] + ")");
            }
        }
    }

    public static int leastStep;
    public static LinkedList<int[]> shortPath;

    /**
     * @param arr    迷宫
     * @param mark   标记是否走过
     * @param i      横坐标
     * @param j      纵坐标
     * @param path   路径
     * @param row    迷宫的行数
     * @param column 迷宫的列数
     */
    private static void dfs(int[][] arr,
                            boolean[][] mark,
                            int i,
                            int j,
                            LinkedList<int[]> path,
                            int row,
                            int column) {

        if (i == row - 1 && j == column - 1) {
            // 到出口了。
            if (path.size() < leastStep) {
                shortPath = new LinkedList<>(path);// 如果这个路径比较短的话，保存。
                leastStep = path.size();
            }
            return;
        }

        // 进行遍历。四个方向。
        int[][] move = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int k = 0; k < 4; k++) {

            int x = i + move[k][0];
            int y = j + move[k][1];

            if (x < 0 || x >= row || y < 0 || y >= column) {
                continue;
            }

            if (mark[x][y]) { // 说明走过了
                continue;
            }

            // 说明在合理的范围中，并且这个位置没有走过。
            if (arr[x][y] == 1) { // 说明是墙
                continue;
            }

            // 这个位置不是墙。还在合理的范围，还没走过。
            mark[x][y] = true;

            path.add(new int[]{x, y}); // path中添加这个坐标

            dfs(arr, mark, x, y, path, row, column);

            path.removeLast();
            mark[x][y] = false;
        }
    }
}