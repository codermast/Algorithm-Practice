package problem.leet1512;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /*
    *   暴力求解
    * */
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