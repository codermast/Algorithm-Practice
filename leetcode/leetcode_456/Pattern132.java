package leetcode_456;

public class Pattern132 {

    // 1. 三循环暴力解法，会超时
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[k] && nums[k] < nums[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // 2. 优化为双循环
    public boolean find132pattern2(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                if (nums[i] < nums[k] && nums[k] < nums[j]) {
                    return true;
                }

                j++;
            }
        }
        return false;
    }
}
