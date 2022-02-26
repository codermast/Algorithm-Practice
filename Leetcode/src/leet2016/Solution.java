package leet2016;

public class Solution {
    public int maximumDifference(int[] nums) {
        int max = 0;
        boolean isTrue = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i;j<nums.length;j++){
                if (i < j && nums[i] < nums[j]){
                    max = Math.max(max,nums[j] - nums[i]);
                    isTrue = true;
                }
            }
        }
        if (isTrue){
            return max;
        }else {
            return -1;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {7,1, 5,4};
        int[] arr2 = {9,4, 3,2};
        System.out.println(s.maximumDifference(arr));
        System.out.println(s.maximumDifference(arr2));
    }
}
