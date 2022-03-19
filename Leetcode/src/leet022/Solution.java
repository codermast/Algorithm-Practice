package leet022;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    /*
     *  n + 1 行的为 将 n 行的所有可能性的右括号前加括号得来。
     *  */
    public List<String> generateParenthesis(int n) {
        List<String> prelist = Collections.singletonList("()");
        if (n == 1) {
            return prelist;
        }
        List<String> dplist = new LinkedList<>();
        for (int i = 1; i < n; i++) {
            if (i != 1) {
                prelist = dplist;
                dplist = new LinkedList<>();
            }
            for (String s : prelist) {
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (c == ')') {
                        String sb = s.substring(0, j) + "()" + s.substring(j);
                        dplist.add(sb);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i + 1; j++) {
                sb.append("()");
            }
            dplist.add(sb.toString());
        }
        return dplist.stream().distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.generateParenthesis(3));
        System.out.println(s.generateParenthesis(4));

    }
}
