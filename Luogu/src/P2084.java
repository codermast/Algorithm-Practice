import java.util.Scanner;

public class P2084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();

        String n = String.valueOf(scanner.next());

        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < n.length(); i++) {
            int num = Integer.parseInt(String.valueOf(n.charAt(i)));
            if (num != 0) {
                ret.append(num).append("*").append(m).append("^").append(n.length() - i - 1);
                if (i != n.length() - 1) {
                    ret.append("+");
                }
            }
        }
        if (ret.charAt(ret.length() - 1) == '+'){
            ret.delete(ret.length() - 1,ret.length());
        }
        System.out.println(ret);
    }
}
