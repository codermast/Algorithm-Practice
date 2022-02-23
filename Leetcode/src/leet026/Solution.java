package leet026;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int midNum = nums[0];
        int index = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] != midNum){
                nums[index] = nums[i];
                midNum = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        Solution s = new Solution();
        int count = s.removeDuplicates(arr);
        for(int i = 0;i<count;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
