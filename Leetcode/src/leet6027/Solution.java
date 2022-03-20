package leet6027;

public class Solution {
    public int countHillValley(int[] nums) {
        if (nums.length <= 2) {
            return 0;
        }
        int count = 0;
        // i 为 判断的下标，第一个和最后一个不用判断
        for (int i = 1; i < nums.length - 1; i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right <= nums.length - 1) {
                // 峰 或者 谷
                if (nums[i] > nums[left] && nums[i] > nums[right] || nums[i] < nums[left] && nums[i] < nums[right]) {
                    count++;
                    break;
                    // 既不是峰，也不是谷
                } else if (nums[i] < nums[left] && nums[i] > nums[right] || nums[i] > nums[left] && nums[i] < nums[right]) {
                    break;
                } else {
                    if (nums[i] == nums[left]) {
                        left--;
                    }

                    if (nums[i] == nums[right]) {
                        right++;
                    }
                }
                i = right - 1;
            }
        }
        return count;
    }
}
