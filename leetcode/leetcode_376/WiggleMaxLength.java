package leetcode_376;

public class WiggleMaxLength {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int ret = 1;
        int preDiff = 0;
        for (int i = 1; i < nums.length; i++) {
            int curDiff = nums[i] - nums[i - 1];

            if (curDiff > 0 && preDiff <= 0 || curDiff < 0 && preDiff >= 0) {
                preDiff = curDiff;
                ret++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        WiggleMaxLength instance = new WiggleMaxLength();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(instance.wiggleMaxLength(nums));
    }
}
