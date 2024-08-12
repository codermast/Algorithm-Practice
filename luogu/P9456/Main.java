package P9456;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[n * k][m];

        for(int i = 0; i< n * k ;i++){
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
