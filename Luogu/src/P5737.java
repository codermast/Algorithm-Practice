import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P5737 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYear = scanner.nextInt();
        int endYear = scanner.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = startYear; i <= endYear; i++) {
            if (isLeapYear(i)){
                list.add(i);
            }
        }
        System.out.println(list.size());
        int i = 1;
        for (Integer integer : list) {
            System.out.print(integer);
            if (i != list.size()){
                System.out.print(" ");
            }
            i++;
        }
    }

    // 判断闰年
    private static boolean isLeapYear(int i) {
        return i % 4 == 0 && i % 100 != 0 || i % 400 == 0;
    }
}
