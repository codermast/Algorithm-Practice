package leet1556;

public class Solution {

    public static String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));

        for(int i = sb.length() - 3; i > 0; i -= 3){
            sb.insert(i, '.');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(thousandSeparator(45679789));
    }
}
