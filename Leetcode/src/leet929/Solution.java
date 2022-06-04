package leet929;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] arr = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        String[] arr2 = {"test.email+alex@leetcode.com", "test.email.leet+alex@code.com"};
        System.out.println(s.numUniqueEmails(arr2));
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] split = email.split("@");

            String sb = mailPre(split[0]) + "@" + mailNext(split[1]);
            set.add(sb);
        }
        return set.size();
    }

    // 处理本地名
    private String mailPre(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+') {
                break;
            } else if (c != '.') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // 处理域名
    private String mailNext(String s) {
        return s;
    }
}
