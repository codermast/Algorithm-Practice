package leetcode_35;

public class SearchInsertPosition {

    // 遍历法
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < target) {
                i++;
            } else {
                return i;
            }
        }
        return i;
    }

    // 二分查找法
    public int searchInsert1(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] == target) {
                return middle;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }
}
