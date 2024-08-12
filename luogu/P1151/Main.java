package P1151;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        boolean haveSolution = false;

        for (int i = 10000; i <= 30000; i++) {
            int sub1 = Integer.parseInt(String.valueOf(i).substring(0, 3));
            int sub2 = Integer.parseInt(String.valueOf(i).substring(1, 4));
            int sub3 = Integer.parseInt(String.valueOf(i).substring(2, 5));

            if (sub1 % k == 0 && sub2 % k == 0 && sub3 % k == 0) {
                haveSolution = true;
                System.out.println(i);
            }
        }

        if (!haveSolution) {
            System.out.println("No");
        }
    }
}
