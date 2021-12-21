package problem.leet1512;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ret = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                if(nums[i] == nums[j] && i < j){
                    ret ++;
                }
            }
        }
        return ret;
    }
}