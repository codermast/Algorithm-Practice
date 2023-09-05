package leet2605;

public class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int[] arr = new int[9];

        int sameNumMin = 10;

        int minNums1 = Integer.MAX_VALUE;
        for (int i : nums1) {
            arr[i - 1] = 1;
            minNums1 = Math.min(minNums1, i);
        }
        int minNums2 = Integer.MAX_VALUE;

        for (int i : nums2) {
            if (arr[i - 1] == 1) {
                sameNumMin = Math.min(sameNumMin, i);
            }
            minNums2 = Math.min(minNums2, i);
        }

        if (sameNumMin != 10) {
            return sameNumMin;
        }

        if (minNums2 > minNums1) {
            return minNums1 * 10 + minNums2;
        }

        return minNums2 * 10 + minNums1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {5, 7};
        System.out.println(s.minNumber(nums1, nums2));
    }
}
