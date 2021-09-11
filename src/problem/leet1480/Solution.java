package problem.leet1480;

public class Solution {
    public int[] runningSum(int[] nums) {
        int[] ret = new int[nums.length];

        int i = 0;
        while(i<nums.length){
            int sum = 0;
            for(int j = 0;j<i+1;j++){
                sum += nums[j];
            }
            ret[i] = sum;
            i++;
        }
        return ret;
    }
}
