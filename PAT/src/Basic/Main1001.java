package Basic;

import java.util.Scanner;

public class Main1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n >> 1;
            } else {
                n = (n * 3 + 1) >> 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
