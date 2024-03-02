package leetcode_136;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber1(int[] nums) {
        int ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ret ^= nums[i];
        }
        return ret;
    }

    public int singleNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        Object[] array = set.toArray();
        return (int) array[0];
    }
}
