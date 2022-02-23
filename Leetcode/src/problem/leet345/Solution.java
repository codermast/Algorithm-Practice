package problem.leet345;

import java.util.Stack;

public class Solution {
    public static String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<s.length();i++) {
            if (isVowel(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder(s);
        for(int i = 0;i<sb.length();i++){
            if(isVowel(sb.charAt(i))){
                sb.replace(i,i+1,""+stack.pop());
            }
        }
        return sb.toString();
    }

    /*
    *   判断是否为元音字符
    * */
    public static boolean isVowel(char c){
        switch (c){
            case 'a':return true;
            case 'e':return true;
            case 'i':return true;
            case 'o':return true;
            case 'u':return true;
            case 'A':return true;
            case 'E':return true;
            case 'I':return true;
            case 'O':return true;
            case 'U':return true;
            default : return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("race car"));
    }
}
