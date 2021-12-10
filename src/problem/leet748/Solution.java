package problem.leet748;

public class Solution {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String str = licensePlate.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<licensePlate.length();i++){
            char c = str.charAt(i);
            if(c <= 122 && c >= 97){
                sb.append(c);
            }
        }
        String maxLenStr = new String();
        boolean isCom = true;
        for(String s : words){
            StringBuilder sb2 = new StringBuilder(s);
            for(int i = 0;i<sb.length();i++){
                if(!sb2.toString().contains(String.valueOf(sb.charAt(i)))){
                    isCom = false;
                    break;
                }else{
                    int i1 = sb2.toString().indexOf(String.valueOf(sb.charAt(i)));
                    sb2.delete(i1,i1+1);
                    isCom = true;
                }
            }
            if(isCom) {
                if (maxLenStr.equals("") || maxLenStr.length() > s.length()) {
                    maxLenStr = s;
                }
            }
        }
        return maxLenStr;
    }
}