package P1035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int i = 0;
        double sn = 0;
        while (sn <= k) {
            i++;
            sn += ((double) 1 / i);
        }
        System.out.print(i);
    }
}
