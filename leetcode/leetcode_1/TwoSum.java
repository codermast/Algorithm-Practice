package leetcode_1;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] ret = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        // 由于题目中给的，必然是存在的情况，则此行只是为了保证程序语法正确而已
        return ret;
    }

    // 借助哈希表
    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ret = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                ret[0] = i;
                ret[1] = map.get(target - nums[i]);
                return ret;
            }

            map.put(nums[i], i);
        }
        return ret;
    }
}
