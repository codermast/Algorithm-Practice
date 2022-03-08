package leet004;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int len = nums1.length + nums2.length;

        int[] dp = new int[2];
        for (int k = 0; k <= len / 2; k++) {
            if (i == nums1.length) {
                dp[0] = dp[1];
                dp[1] = nums2[j];
                j++;
                continue;
            }

            if (j == nums2.length) {
                dp[0] = dp[1];
                dp[1] = nums1[i];
                i++;
                continue;
            }

            if (nums1[i] < nums2[j]) {
                dp[0] = dp[1];
                dp[1] = nums1[i];
                i++;
            } else {
                dp[0] = dp[1];
                dp[1] = nums2[j];
                j++;
            }
        }

        if (len % 2 == 0) {
            return (dp[0] + dp[1]) / 2.0;
        } else {
            return dp[1];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        System.out.println(solution.findMedianSortedArrays(arr1, arr2));
    }
}
