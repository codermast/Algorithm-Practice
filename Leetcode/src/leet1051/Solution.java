package leet1051;

import java.util.Arrays;

public class Solution {
    public int heightChecker(int[] heights) {
        int[] expected  = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,1,4,2,1,3};
        System.out.println(s.heightChecker(arr));
    }
}
