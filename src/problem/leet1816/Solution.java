package problem.leet1816;

public class Solution {
    public String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k - 1 ; i++) {
            sb.append(s1[i] + " ");
        }

        return sb.append(s1[k - 1]).toString();
    }
}
