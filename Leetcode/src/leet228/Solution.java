package leet228;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<>();

        if (nums.length == 0) {
            return ret;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] - 1 != nums[j - 1]) {
                if (j - 1 == i) {
                    ret.add(String.valueOf(nums[i]));
                } else {
                    ret.add(nums[i] + "->" + nums[j - 1]);
                }
                i = j;
            }
            j++;
        }

        if (j - 1 == i) {
            ret.add(String.valueOf(nums[j - 1]));
        } else {
            ret.add(nums[i] + "->" + nums[j - 1]);
        }

        return ret;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] arr = {0, 2, 3, 4, 6, 8, 9};

        List<String> strings = s.summaryRanges(arr);

        for (String str : strings) {
            System.out.println(str);
        }
    }
}
