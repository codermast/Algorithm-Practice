package problem.leet896;

public class Solution {
    public boolean isMonotonic(int[] nums) {
        // 判断是否为升序，默认为升序
        boolean isUp = true;

        boolean isFirst = true;
        for(int i = 0;i + 1<nums.length;i++){
            if (isFirst) {
                if (nums[i + 1] < nums[i]) {
                    isUp = false;
                    isFirst = false;
                }

                if(nums[i + 1] > nums[i]) {
                    isFirst = false;
                }
            }

            if (isUp){
                if (nums[i] > nums[i + 1]){
                    return false;
                }
            }else{
                if (nums[i] < nums[i + 1]){
                    return false;
                }
            }
        }
        return true;
    }
}
