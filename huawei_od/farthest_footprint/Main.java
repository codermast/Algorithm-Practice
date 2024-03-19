package farthest_footprint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> coordinateList = new ArrayList<>();
        int left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left = i;
            } else if (c == ')') {
                right = i;
                coordinateList.add(s.substring(left, right + 1));
            }
        }

        for (int i = 0; i < coordinateList.size(); i++) {
            String string = coordinateList.get(i);
            String[] split = string.substring(1, string.length() - 1).split(",");
            int numLeft = Integer.parseInt(split[0]);
            int numRight = Integer.parseInt(split[1]);

            if ((numLeft >= 1000 || numLeft <= 0 || numRight >= 1000 || numRight <= 0)) {
                coordinateList.remove(i);
            }
        }

        coordinateList.sort((o1, o2) -> {
            String[] o1Split = o1.substring(1, o1.length() - 1).split(",");
            String[] o2Split = o2.substring(1, o2.length() - 1).split(",");
            int o1NumLeft = Integer.parseInt(o1Split[0]);
            int o1NumRight = Integer.parseInt(o1Split[1]);

            int o2NumLeft = Integer.parseInt(o2Split[0]);
            int o2NumRight = Integer.parseInt(o2Split[1]);

            int o1Sum = o1NumLeft * o1NumLeft + o1NumRight * o1NumRight;
            int o2Sum = o2NumLeft * o2NumLeft + o2NumRight * o2NumRight;

            return o2Sum - o1Sum;
        });

        if (!coordinateList.isEmpty()) {
            System.out.println(coordinateList.get(0));
        } else {
            System.out.println("(0,0)");
        }
    }
}
