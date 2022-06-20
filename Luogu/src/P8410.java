import java.util.Scanner;

public class P8410 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.nextLine();
        int ret = 0;
        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            String line = scanner.nextLine();

            if (line.equals("/oh")) {
                ret += a;
            } else if (line.equals("/hsh")) {
                ret += b;
            }
        }
        System.out.println(ret);
    }
}
