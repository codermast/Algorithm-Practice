package string_sequence_determination;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String l = scanner.nextLine();

        int i = 0, j = 0;

        while (j < l.length() && i < s.length()) {
            char sch = s.charAt(i);
            char lch = l.charAt(j);

            if (sch == lch) {
                i++;
            }
            j++;
        }
        if (i == s.length()) {
            System.out.println(j - 1);
        } else {
            System.out.println(-1);
        }
    }
}
