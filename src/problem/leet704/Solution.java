package problem.leet704;

public class Solution {
    /*
    *   二分查找
    * */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] == target) {
                return middle;
            } else {
                right = middle;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
}
