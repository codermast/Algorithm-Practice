import java.util.Scanner;

public class P5739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = getFactorial(n);
        System.out.println(num);
    }

    private static int getFactorial(int n) {
        if (n <= 2){
            return n;
        }
        return n * getFactorial(n - 1);
    }
}
