package leet152;

public class Solution {
    public static int maxProduct(int[] nums) {
       int max = 1;
       int min = 1;

       int ret = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // 为负数时，则乘积后的最大值和最小值调换。
            if (nums[i] < 0){
                int tmp = max;
                max = min;
                min = tmp;
            }
            max = Math.max(nums[i],max * nums[i]);
            min = Math.min(nums[i],min * nums[i]);
            ret = Math.max(max,ret);
        }
       return ret;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int[] arr2 = {-2,0,-1};
        System.out.println(maxProduct(arr2));
    }
}
