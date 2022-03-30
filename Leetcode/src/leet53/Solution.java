package leet53;

public class Solution {
    // 暴力法 : Leetcode 会超时
    public int maxSubArray(int[] nums) {
        int ret = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                ret = Math.max(ret, sum);
            }
        }
        return ret;
    }
    // O(n)时间复杂的 贪心算法
    public int maxSubArray2(int[] nums) {
        int ret = nums[0];
        int sum = 0;

        for (int num : nums) {
            sum += num;
            ret = Math.max(sum, ret);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(s.maxSubArray2(arr));
    }
}
