package Basic;

import java.util.Scanner;

public class Main1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] arr = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += n;
        }
        String strSum = String.valueOf(sum);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strSum.length(); i++) {
            char c = strSum.charAt(i);
            int index = c - 48;
            sb.append(arr[index]).append(" ");
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
