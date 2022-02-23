package leet557;

public class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder ret = new StringBuilder();
        for(int i = 0;i<s1.length;i++){
            StringBuilder sb = new StringBuilder(s1[i]);
            ret.append(sb.reverse());
            if(i != s1.length - 1){
                ret.append(" ");
            }
        }
        return ret.toString();
    }
}
