package P1824;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int interval = n - c + 1;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < c - 1; i++) {
            max = Math.max(arr[i + interval] - arr[i], max);
        }
        System.out.println(max);
    }
}
