package leet028;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }

        int length = needle.length();

        for(int i = 0;i<haystack.length() - length + 1;i++){
            if(haystack.substring(i,i+length).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
