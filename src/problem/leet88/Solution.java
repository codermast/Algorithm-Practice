package problem.leet88;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    // 88. 合并两个有序数组
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m;i<nums1.length;i++){
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }
}
