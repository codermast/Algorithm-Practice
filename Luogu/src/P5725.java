import java.util.Scanner;

public class P5725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        // 输出正方形
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num * num; i++) {
            sb.append(getFormatNum(i));
            index++;
            if (index == num) {
                index = 0;
                System.out.println(sb);
                sb = new StringBuilder();
            }
        }
        System.out.println();
        // 输出三角形
        sb = new StringBuilder();

        index = 1;

        for (int i = 1; i <= (num + num * num) / 2; ) {
            for (int j = 0; j < num - index; j++) {
                sb.append("  ");
            }

            for (int j = 0; j < index; j++) {
                sb.append(getFormatNum(i));
                i++;
            }
            System.out.println(sb);
            sb = new StringBuilder();
            index++;
        }
    }

    // 获取格式化的数字
    private static String getFormatNum(int i) {
        if (i < 10) {
            return "0" + i;
        } else {
            return String.valueOf(i);
        }
    }
}
