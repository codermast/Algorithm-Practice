import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P5734 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        StringBuilder sb = new StringBuilder(scanner.next());

        List<String> list = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    String str = scanner.next();
                    sb.append(str);
                    list.add(sb.toString());
                    break;
                case 2:
                    int left = scanner.nextInt();
                    int right = scanner.nextInt();
                    sb = new StringBuilder(sb.substring(left,left + right));
                    list.add(sb.toString());
                    break;
                case 3:
                    int index = scanner.nextInt();
                    String indexStr = scanner.next();
                    String leftStr = sb.substring(0, index);
                    String rightStr = sb.substring(index,sb.length());
                    sb = new StringBuilder().append(leftStr).append(indexStr).append(rightStr);
                    list.add(sb.toString());
                    break;
                case 4:
                    String findStr = scanner.next();
                    list.add(String.valueOf(sb.indexOf(findStr)));
                    break;
                default:
                    break;
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
