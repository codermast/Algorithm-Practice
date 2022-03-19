package offer85;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<List<String>> dpList = new LinkedList<>();

        List<String> list = new LinkedList<>();
        list.add("()");
        dpList.add(list);

        // dp : dpList.get(i) -> 代表的是有 i + 1个括号的情况
        for (int i = 1; i < n; i++) {
            List<String> preList = dpList.get(i - 1);
            List<String> curList = new LinkedList<>();

            StringBuilder defaultStr = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                defaultStr.append("()");
            }
            curList.add(defaultStr.toString());

            for (String s : preList) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ')') {
                        String leftStr = s.substring(0, j);
                        String rightStr = s.substring(j + 1);
                        sb.append(leftStr);
                        sb.append("())");
                        sb.append(rightStr);
                        curList.add(sb.toString());
                        sb = new StringBuilder();
                    }
                }
            }
            dpList.add(curList);
        }
        return dpList.get(dpList.size() - 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        for (String generateParenthesis : s.generateParenthesis(3)) {
            System.out.print(generateParenthesis + "   ");
        }
        System.out.println();
        for (String generateParenthesis : s.generateParenthesis(4)) {
            System.out.print(generateParenthesis + "   ");
        }
    }
}
