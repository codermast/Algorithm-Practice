package B2102;

import java.util.Scanner;

public class Main {
    // 鞍点问题
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[5][5];

        int[] row = new int[5];
        int[] col = new int[5];

        for (int i = 0; i < 5; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();

                // 初始化列
                if (i == 0) {
                    col[j] = arr[i][j];
                } else {
                    if (col[j] > arr[i][j]) {
                        col[j] = arr[i][j];
                    }
                }
                max = Math.max(max, arr[i][j]);
            }
            row[i] = max;
        }

        int maxIndex = arrMinIndex(row);
        int minIndex = arrMaxIndex(col);

        if (row[maxIndex] != col[minIndex]) {
            System.out.printf("%s", "not found");
        } else {
            System.out.printf("%d %d %d", maxIndex + 1, minIndex + 1, arr[maxIndex][minIndex]);
        }
    }

    public static int arrMaxIndex(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int arrMinIndex(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
