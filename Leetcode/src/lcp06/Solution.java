package lcp06;

public class Solution {
    public int minCount(int[] coins) {
        int count = 0;
        for (int i : coins){
            count += (i + 1) / 2;
        }
        return count;
    }
}
