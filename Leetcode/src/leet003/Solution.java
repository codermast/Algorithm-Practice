package leet003;

import java.util.Arrays;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int maxlen = 0;
        // 分别求最长的字串，每次递减一个
        for(int i = 0;i<arr.length;i++) {
            char[] chars = Arrays.copyOfRange(arr,i,arr.length);
            sb.delete(0, sb.length());

    
            for (char c : chars) {
                String tmp = "" + c;
                if (sb.indexOf(tmp) >= 0) {
                    maxlen = Math.max(maxlen, sb.length());
                    sb.delete(0, sb.length());
                } else {
                    sb.append(c);
                }
            }
            maxlen = Math.max(maxlen,sb.length());
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String str = "jbpnbwwd";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
