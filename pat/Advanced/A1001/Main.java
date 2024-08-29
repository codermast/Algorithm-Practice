package Advanced.A1001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuffer ret = new StringBuffer();
        int sum = a + b;

        int absSum = Math.abs(sum);

        if (absSum < 1000) {
            System.out.println(sum);

        } else {

        }
    }
}