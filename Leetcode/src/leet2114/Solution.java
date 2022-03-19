package leet2114;

public class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            String[] strArr = sentence.split(" ");
            max = Math.max(strArr.length, max);
        }
        return max;
    }
}
