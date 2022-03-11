package leet001;

import java.util.Arrays;

public class Solution {

    // 暴力求解：双循环
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3, 2, 4};
        int[] ints = s.twoSum(arr, 6);
        System.out.println(Arrays.toString(ints));
    }
}
