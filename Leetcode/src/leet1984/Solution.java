package leet1984;

import java.util.Arrays;

public class Solution {
    public static int minimumDifference(int[] nums, int k) {
        // 将数组进行排序
        Arrays.sort(nums);

        // 如果只选择一个数字，则最大最小值的差为0
        if(k == 1){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        // 滑动窗口解决
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
