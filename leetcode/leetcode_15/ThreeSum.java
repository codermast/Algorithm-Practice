package leetcode_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // 对数组进行排序，避免重复结果
        Arrays.sort(nums);

        List<List<Integer>> ret = new ArrayList<>();

        // i 确定一个数，这里 -2 是保证 j k 访问数组时不越界
        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i];

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int twoSum = nums[j] + nums[k];
                if (twoSum == target) {
                    ret.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) j++;

                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                } else if (twoSum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return ret;
    }
}
