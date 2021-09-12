package problem.leet1470;
//https://leetcode-cn.com/problems/shuffle-the-array/
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ret = new int[nums.length];

        int index = 0;
        for(int i = 0;i<n;i++){
            ret[index] = nums[i];
            index += 2;
        }
        index = 1;
        for(int i = n;i<n * 2;i++){
            ret[index] = nums[i];
            index += 2;
        }

        return ret;
    }
}
