package Basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String badStr = scanner.nextLine();
        String outStr = scanner.nextLine();

        Set<Character> badSet = new HashSet<>();

        for (int i = 0; i < badStr.length(); i++) {
            char c = badStr.charAt(i);
            switch (c) {
                case '_':
                    badSet.add(' ');
                    break;
                case ',':
                case '.':
                case '-':
                case '+':
                    badSet.add('.');
                    break;
                default:
                    badSet.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < outStr.length(); i++) {
            char c = outStr.charAt(i);

            if (c > 96 && c < 123) {          // 判断为小写字母
                if (!badSet.contains(Character.toUpperCase(c))) {
                    sb.append(c);
                }
            } else if (c < 91 && c > 64) {    // 判断为大写字母
                if (!badSet.contains(c) && !badSet.contains('.')) {
                    sb.append(c);
                }
            } else {
                if (!badSet.contains(c)) {
                    sb.append(c);
                }
            }
        }
        System.out.println(sb);
    }
}
