import java.util.*;

public class PalindromeStrViVo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s, 0, i);
            sb.append(s, i + 1, s.length());
            if (isPalindromeStr(sb.toString())) {
                System.out.println(sb);
                return;
            }
        }
        System.out.println("false");
    }

    // 判断是否为回文字符串
    private static boolean isPalindromeStr(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}
