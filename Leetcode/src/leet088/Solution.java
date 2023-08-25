package leet088;

import java.util.Arrays;

public class Solution {
    // 88. 合并两个有序数组
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;
        while (i >= 0 || j >= 0) {
            if (i < 0){
                nums1[index] = nums2[j];
                index --;
                j --;
                continue;
            }

            if (j < 0){
                nums1[index] = nums1[i];
                index --;
                i --;
                continue;
            }

            if (nums1[i] > nums2[j]){
                nums1[index] = nums1[i];
                index --;
                i --;
            }else {
                nums1[index] = nums2[j];
                index --;
                j --;
            }
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] arr = new int[m + n];

        int index = 0;

        while (i < m || j < n){
            if (i == m){
                arr[index] = nums2[j];
                j ++;
                index ++;
                continue;
            }

            if(j == n){
                arr[index] = nums1[i];
                i ++;
                index ++;
                continue;
            }

            if (nums1[i] < nums2[j]){
                arr[index] = nums1[i];
                i ++;
                index ++;

            }else {
                arr[index] = nums2[j];
                j ++;
                index ++;

            }

        }

        System.arraycopy(arr, 0, nums1, 0, nums1.length);
    }

    public static void main(String[] args) {
        int[] arr1 = {3,4,7,9,10,0,0,0,0,0,0};
        int[] arr2 = {0,2,5,8,11,13};

        merge2(arr1,5,arr2,6);

        System.out.println(Arrays.toString(arr1));
    }
}
