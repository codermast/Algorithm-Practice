package leet806;

public class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int linelen = 0;
        int lineNum = 0;
        for (int i = 0; i < s.length(); i++) {
            int charindex = s.charAt(i) - 97;
            int cWidth = widths[charindex];

            if (cWidth + linelen <= 100){
                linelen += cWidth;
            }else {
                linelen = cWidth;
                lineNum ++;
            }
        }
        lineNum ++;
        return new int[]{lineNum,linelen};
    }
}
