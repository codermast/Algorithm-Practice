package leet376;

public class Solution {
    /*
    *   此方法可以看做为贪心又可看作动态规划。
    *       思路：
    *           去除所有单调区间中不是极值的点，剩下的都是符合要求的。
    *           这里需要准确的了解到，当num.length == 1 时，此种情况是满足的即可。
    * */
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int curDiff = 0;
        int preDiff = 0;
        int count = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            curDiff = nums[i + 1] - nums[i];
            if (curDiff > 0 && preDiff <= 0 || curDiff < 0 && preDiff >= 0) {
                count++;
                preDiff = curDiff;
            }
        }
        return count;
    }
}
