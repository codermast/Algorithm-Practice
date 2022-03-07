package leet003;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                boolean add = set.add(c);
                if (add) {
                    sb.append(c);
                } else {
                    break;
                }
            }
            if (ret.length() < sb.length()) {
                ret = sb;
            }
        }
        return ret.length();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(s.lengthOfLongestSubstring("bbbbb"));
        System.out.println(s.lengthOfLongestSubstring("pwwkew"));
    }
}
