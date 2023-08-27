package leet032;

import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        // 长度为 0 时，直接返回
        if (s.length() == 0){
            return 0;
        }

        // 长度不为 0 时
        Stack<Character> stack = new Stack<>();
        StringBuffer tmp = new StringBuffer();
        StringBuffer ret = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '('){
                stack.push(c);
            }else{
            }
        }

        return ret.length();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.longestValidParentheses(")()()()()()()("));
        System.out.println(s.longestValidParentheses(")()())"));
    }
}
