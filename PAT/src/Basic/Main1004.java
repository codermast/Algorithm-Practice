package Basic;

import java.util.Scanner;

public class Main1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] first = scanner.nextLine().split(" ");

        String[] min = new String[3];
        String[] max = new String[3];

        min[0] = first[0];
        min[1] = first[1];
        min[2] = first[2];

        max[0] = first[0];
        max[1] = first[1];
        max[2] = first[2];

        for (int i = 0; i < n - 1; i++) {
            String[] arr = scanner.nextLine().split(" ");

            if (Integer.parseInt(arr[2]) > Integer.parseInt(max[2])) {
                max[0] = arr[0];
                max[1] = arr[1];
                max[2] = arr[2];
            }

            if (Integer.parseInt(arr[2]) < Integer.parseInt(min[2])) {
                min[0] = arr[0];
                min[1] = arr[1];
                min[2] = arr[2];
            }
        }
        System.out.println(max[0] + " " + max[1]);
        System.out.println(min[0] + " " + min[1]);
    }
}
