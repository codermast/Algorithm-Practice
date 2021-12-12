package problem.leet415;

public class Solution {
    public static String addStrings(String num1, String num2) {
        // 判断是否进位
        boolean isCarry = false;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {

            int sum = 0;
            if (i >= 0 && j >= 0) {
                sum = num1.charAt(i) + num2.charAt(j) - 48 * 2;
            } else if (i < 0) {
                sum = num2.charAt(j) - 48;
            } else {
                sum = num1.charAt(i) - 48;
            }


            if (isCarry) {
                sum += 1;
            }

            if (sum > 9) {
                sum %= 10;
                isCarry = true;
            } else {
                isCarry = false;
            }
            sb.append(sum);

            i--;
            j--;
        }
        if (isCarry) {
            sb.append("1");
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("0", "0"));
        System.out.println(addStrings("1", "2"));
        System.out.println(addStrings("111", "222"));
        System.out.println(addStrings("99999999999", "888888888888"));
    }
}
