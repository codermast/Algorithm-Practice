import java.util.Scanner;

public class P5718 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int ret = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            ret = Math.min(ret,num);
        }
        System.out.println(ret);
    }
}
