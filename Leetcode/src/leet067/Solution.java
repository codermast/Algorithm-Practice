package leet067;

public class Solution {
    /*
     *   二进制求和
     * */
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        boolean isCarry = false;
        while (i >= 0 && j >= 0) {
            if (a.charAt(i) == b.charAt(j) && a.charAt(i) == '0') {
                if (isCarry) {
                    sb.append("1");
                    isCarry = false;
                } else {
                    sb.append("0");
                }
            } else if (a.charAt(i) == b.charAt(j) && a.charAt(i) == '1') {
                if (isCarry) {
                    sb.append("1");
                } else {
                    sb.append("0");
                    isCarry = true;
                }
            } else {
                if (isCarry) {
                    sb.append("0");
                } else {
                    sb.append("1");
                }
            }
            i--;
            j--;
        }
        int k = Math.max(i, j);
        String s ;
        if (a.length() > b.length()) {
            s = a.substring(0, k + 1);
        } else {
            s = b.substring(0, k + 1);
        }
        while (k >= 0) {
            if (isCarry) {
                if (s.charAt(k) == '1') {
                    sb.append('0');
                } else {
                    sb.append('1');
                    isCarry = false;
                }
            } else {
                sb.append(s.charAt(k));
            }
            k--;
        }
        if (isCarry) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}

