import java.util.Scanner;

public class NumberOf1Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();

            int count = 0;
            for (int i = 0; i < 32; i++) {
                if ((num & 1) == 1) {
                    count++;
                }
                num >>= 1;
            }
            System.out.println(count);
        }
    }
}
