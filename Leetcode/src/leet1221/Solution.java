package leet1221;

public class Solution {
    public static int balancedStringSplit(String s) {
        int ret = 0;
        int charlNum = 0;
        int charrNum = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'L'){
                charlNum++;
            }

            if(s.charAt(i) == 'R'){
                charrNum++;
            }

            if(charlNum == charrNum){
                ret++;
                charlNum = 0;
                charrNum = 0;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
}
