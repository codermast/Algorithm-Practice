package leet1678;

public class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); ) {
            char c = command.charAt(i);
            if (c == 'G') {
                sb.append("G");
                i++;
            } else if (c == '(' && command.charAt(i + 1) == ')') {
                sb.append("o");
                i += 2;
            } else if (command.startsWith("(al)", i)) {
                sb.append("al");
                i += 4;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.interpret("G()(al)"));
    }
}
