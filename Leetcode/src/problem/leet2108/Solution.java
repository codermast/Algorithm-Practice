package problem.leet2108;

public class Solution {
    public String firstPalindrome(String[] words) {
        for(String str : words){
            if(isPalindromeString(str)){
                return str;
            }
        }
        return "";
    }
    /*
    *   判断是否为回文字符串
    * */
    public boolean isPalindromeString(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
