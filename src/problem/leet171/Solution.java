package problem.leet171;

public class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0;
        for(int i = columnTitle.length() - 1;i>=0;i--){
            num +=  (columnTitle.charAt(i) - 64) * Math.pow(26,columnTitle.length() - 1 - i);
        }
        return num;
    }
}
