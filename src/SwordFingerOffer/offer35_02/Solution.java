package SwordFingerOffer.offer35_02;

public class Solution {
    public int missingNumber(int[] nums) {
        if(nums[0] != 0){
            return 0;
        }

        int number = 0;
        for(int i = 0;i<nums.length;i++){
             if(nums[i] != number){
                return nums[i] - 1;
            }
            number ++;
        }

        return nums[nums.length - 1] + 1;

    }
    /*
    *   测试用例
    * */
    public static void main(String[] args) {
        int[] arr = {0,1,3};
        Solution s = new Solution();
        System.out.println(s.missingNumber(arr));
    }
}
