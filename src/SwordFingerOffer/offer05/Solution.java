package SwordFingerOffer.offer05;

public class Solution {
    public String replaceSpace(String s) {
        char[] arr = s.toCharArray();
        String ret = "";
        for(char c : arr){
            if(c == ' '){
                ret += "%20";
                continue;
            }
            ret += c;
        }
        return ret;
    }
}
