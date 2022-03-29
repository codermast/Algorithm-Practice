import java.util.Scanner;

public class P5704 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String c = scanner.next();
        char ch = c.charAt(0);
        char upperChar = (char) (ch - 32);
        System.out.println(upperChar);
    }
}
