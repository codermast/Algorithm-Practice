package leet581;

import java.util.Arrays;

public class Solution {
    // 排序方式
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length <= 1){
            return 0;
        }

        int[] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < arr.length){
            if (nums[i] == arr[i]){
                i ++;
            }else {
                break;
            }
        }

        while (j >= 0){
            if (nums[j] == arr[j]){
                j --;
            }else {
                break;
            }
        }
        return Math.max(j - i + 1, 0);
    }

    // 双指针法

    public static void main(String[] args) {
        Solution s= new Solution();
        int[] arr = { 1 ,2,3,4,5,7,8,6,9,10};
        System.out.println(s.findUnsortedSubarray(arr));
    }
}
