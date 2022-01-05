package problem.leet34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int length = nums.length;
        //给定初始值

        int [] ans = new int[]{-1,-1};
        for (int i = 0;i < length;i++){
            if(nums[i] == target){
                //匹配到target 需要判断是否为第几个target
                if(ans[0] != -1) ans[1] = i;
                else {
                    ans[0] = i;
                    ans[1] = i;
                }
            }
        }
        return ans;
    }
}
