package problem.leet20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();

        for(char c:arr){
            if(c == '(' ||c =='[' || c=='{'){
                stack.push(c);
            }else{
                if(stack.empty()){
                    return false;
                }else{
                    if(reversalChar(stack.pop()) != c){
                        return false;
                    }
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }

    public char reversalChar(char c){
        switch (c){
            case '(':
                return ')';
            case '[':
                return ']';
            case '{':
                return '}';
            default:
                return ' ';
        }
    }
}
