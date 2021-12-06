package problem.leet125;

public class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals("")){
            return true;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if((c >= 48 && c <= 57 )|| (c >= 97 && c <= 122)){
                sb.append(c);
            }else if(c >= 65 && c <= 90){
                sb.append((char)(c + 32));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }

}
