package problem.leet709;

public class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0;i<sb.length();i++){
            if(sb.charAt(i) <= 90 && sb.charAt(i) >= 65){
                sb.replace(i,i+1,String.valueOf((char)(sb.charAt(i) + 32)));
            }
        }
        return sb.toString();
    }
}
