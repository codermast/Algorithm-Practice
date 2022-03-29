import java.util.Scanner;

public class P5706 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  t = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.printf("%.3f\n", t / n);
        System.out.println(n * 2);
    }
}
