package problem.leet917;

import java.util.Stack;

public class Solution {
    public static String reverseOnlyLetters(String s) {
        // 栈来存储字符串中的字母
        Stack<Character> stack = new Stack<>();

        // 返回值存容器
        StringBuilder sb = new StringBuilder();

        // 将字符串中的字符全部压入栈
        for (char ch : s.toCharArray()) {
            if(ch >= 65 && ch <= 90 || ch <= 122 && ch >= 97){
                stack.push(ch);
            }
        }

        // 遍历字符串，如果为字母，则将栈顶元素弹出放入 sb，否则放入该字符到 sb
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <= 90 || ch <= 122 && ch >= 97){
                sb.append(stack.pop());
            }else{
                sb.append(ch);
            }
        }
        // 返回String
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
    }
}
