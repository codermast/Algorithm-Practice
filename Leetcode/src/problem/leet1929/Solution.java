package problem.leet1929;

public class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for(int i = nums.length;i<ans.length;i++){
            ans[i - nums.length] = nums[i-nums.length];
            ans[i] = nums[i - nums.length];
        }
        return ans;
    }
}
