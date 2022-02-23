package offer35_02;

class Solution {
    public int missingNumber(int[] nums) {
        if(nums[0] != 0){
            return 0;
        }
        int number = 0;
        for(int i:nums){
            if(i != number){
                return i - 1;
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
