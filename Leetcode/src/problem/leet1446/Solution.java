package problem.leet1446;

public class Solution {
    public static int maxPower(String s) {
        if(s.length() == 0){
            return 0;
        }
        // 最大长度
        int maxLen = 1;

        int num = 1;
        for (int i = 0; i + 1< s.length(); i++) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i +1);
            if(ch == ch2){
                num += 1;
            }else{
                num = 1;
            }
            maxLen = Math.max(maxLen,num);
        }
        return  maxLen;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("abbcccddddeeeeedcba"));
    }
}
