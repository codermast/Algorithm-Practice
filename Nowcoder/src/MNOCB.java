import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MNOCB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> retList = new LinkedList<>();
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int maxLen = 0;
            int count = 0;
            while (num != 0) {
                if ((num & 1) == 1) {
                    count++;
                } else {
                    maxLen = Math.max(maxLen, count);
                    count = 0;
                }
                num >>= 1;
            }
            maxLen = Math.max(maxLen, count);
            retList.add(maxLen);
        }
        for (int integer : retList) {
            System.out.println(integer);
        }
    }
}

