package leet504;

public class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return String.valueOf(0);
        }
        boolean isNegative = false;
        StringBuilder sb = new StringBuilder();
        if (num < 0) {
            isNegative = true;
            num = Math.abs(num);
        }
        while (num > 0) {
            int remainder = num % 7;
            sb.append(remainder);
            num /= 7;
        }
        sb.reverse();
        if (isNegative) {
            sb.append("-");
        }
        return sb.toString();
    }
}
