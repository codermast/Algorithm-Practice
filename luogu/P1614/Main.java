package P1614;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        int minSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (i < m) {
                sum += arr[i];
                minSum = sum;
            } else {
                sum = sum - arr[i - m] + arr[i];
                minSum = Math.min(minSum, sum);
            }
        }
        System.out.println(minSum);
    }
}
