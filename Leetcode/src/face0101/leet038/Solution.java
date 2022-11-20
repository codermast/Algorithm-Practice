package face0101.leet038;

public class Solution {
    public static String countAndSay(int n) {
        String preStr = "1";

        if (n == 1) {
            return preStr;
        }
        StringBuilder curStr = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            char preChar = preStr.charAt(0);
            int equalCount = 0;
            for (int j = 0; j < preStr.length(); j++) {
                char curChar = preStr.charAt(j);

                if (curChar == preChar) {
                    equalCount++;
                } else {
                    curStr.append(equalCount).append(preChar);
                    preChar = curChar;
                    equalCount = 0;
                    j--;
                }
            }
            curStr.append(equalCount).append(preChar);
            preStr = curStr.toString();
            curStr = new StringBuilder();
        }
        return preStr;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(6));
    }
}
