package leetcode_283;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }

    // 双指针：单次遍历
    public void moveZeroes1(int[] nums) {
        if (nums == null || nums.length == 1) {
            return;
        }

        // left 确定已排序的末尾，right 确定需要交换的非零元素
        int left = 0, right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
            }
            right++;
        }
    }
}
