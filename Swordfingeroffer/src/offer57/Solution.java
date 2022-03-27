package offer57;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int[] ret = new int[2];
        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                ret[0] = nums[i];
                ret[1] = nums[j];
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2, 7, 11, 15};
        int[] ints = s.twoSum(arr, 9);
        System.out.println(Arrays.toString(ints));
    }
}
