package leet168;

public class Solution {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0){
            int i = columnNumber % 26;

            char c = (char)(i + 64);
            sb.append(c);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 52;

        System.out.println(convertToTitle(num));
    }
}
