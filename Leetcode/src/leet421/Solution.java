package leet421;

public class Solution {

    /*
    *   暴力求解 时间复杂度 O（n^2）
    * */
    public int findMaximumXOR(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int maxXor = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                    maxXor = Math.max(nums[i] ^ nums[j],maxXor);
            }
        }
        return maxXor;
    }


}
