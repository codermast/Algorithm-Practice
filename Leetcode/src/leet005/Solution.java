package leet005;

public class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        for(;len >= 0;len--) {
            int index = 0;
            while (index + len - 1 < s.length()) {
                String str = s.substring(index, len + index);
                if (isPalindromeStr(str)) {
                    return str;
                }
                index++;
            }
        }
        return null;
    }
    /*
    *   判断是否为回文字符串
    * */
    public boolean isPalindromeStr(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.longestPalindrome("cdedc4"));
    }
}
