package problem.leet1984;

import java.util.Arrays;

public class Solution {
    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        if(k == 1){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i + k- 1 < nums.length; i++) {
            min = Math.min((nums[i + k - 1] - nums[i]),min);
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {9,4,1,7};
        System.out.println(minimumDifference(arr,2));
    }
}
