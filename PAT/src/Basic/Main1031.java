package Basic;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main1031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        String str = "10X98765432";
        List<String> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            boolean isTrue = true;
            String line = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < line.length() - 1; j++) {
                if (line.charAt(j) >= 48 && line.charAt(j) <= 57) {
                    int num = Integer.parseInt(String.valueOf(line.charAt(j)));
                    sum += num * arr[j];
                    sum %= 11;
                } else {
                    list.add(line);
                    isTrue = false;
                    break;
                }
            }

            if (isTrue && str.charAt(sum) != line.charAt(line.length() - 1)) {
                list.add(line);
            }
        }
        if (list.size() == 0) {
            System.out.println("All passed");
        } else {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}